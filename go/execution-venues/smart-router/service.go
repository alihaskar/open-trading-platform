package main

import (
	"fmt"
	"github.com/ettec/open-trading-platform/go/smart-router/strategy"
	"github.com/ettec/otp-common"
	api "github.com/ettec/otp-common/api/executionvenue"
	"github.com/ettec/otp-common/executionvenue"
	"github.com/ettec/otp-common/k8s"
	"github.com/ettec/otp-common/marketdata"
	"github.com/ettec/otp-common/staticdata"
	"os"
	"strconv"
	"time"

	"github.com/ettec/otp-common/bootstrap"

	"github.com/ettec/otp-common/orderstore"

	"google.golang.org/grpc"
	"google.golang.org/grpc/reflection"
	metav1 "k8s.io/apimachinery/pkg/apis/meta/v1"
	logger "log"
	"net"
	"strings"
)

const (
	KafkaBrokersKey        = "KAFKA_BROKERS"
	MaxConnectRetrySeconds = "MAX_CONNECT_RETRY_SECONDS"
)

var log = logger.New(os.Stdout, "", logger.Ltime|logger.Lshortfile)

func main() {

	id := common.SR_MIC
	maxConnectRetry := time.Duration(bootstrap.GetOptionalIntEnvVar(MaxConnectRetrySeconds, 60)) * time.Second
	kafkaBrokersString := bootstrap.GetEnvVar(KafkaBrokersKey)

	s := grpc.NewServer()

	kafkaBrokers := strings.Split(kafkaBrokersString, ",")

	sds, err := staticdata.NewStaticDataSource(false)
	if err != nil {
		log.Fatalf("failed to create static data source:%v", err)
	}

	clientSet := k8s.GetK8sClientSet(false)

	namespace := "default"
	xosrServiceLabelSelector := "app=market-data-source,mic=" + common.SR_MIC
	list, err := clientSet.CoreV1().Services(namespace).List(metav1.ListOptions{
		LabelSelector: xosrServiceLabelSelector,
	})

	if err != nil {
		panic(err)
	}

	if len(list.Items) != 1 {
		log.Panicf("no service found for selector: %v", xosrServiceLabelSelector)
	}

	service := list.Items[0]

	var podPort int32
	for _, port := range service.Spec.Ports {
		if port.Name == "api" {
			podPort = port.Port
		}
	}

	if podPort == 0 {
		log.Panic("aggregate quote source does not have an 'api' port")
	}

	targetAddress := service.Name + ":" + strconv.Itoa(int(podPort))

	mdsQuoteStream, err := marketdata.NewMdsQuoteStream(id, targetAddress, maxConnectRetry, 1000)
	if err != nil {
		panic(err)
	}

	qd := marketdata.NewQuoteDistributor(mdsQuoteStream, 100)

	orderRouter, err := strategy.GetOrderRouter(clientSet, maxConnectRetry)
	if err != nil {
		panic(err)
	}

	executeFn := func(om *strategy.Strategy) {
		ExecuteAsSmartRouterStrategy(om, sds.GetListingsWithSameInstrument, qd.GetNewQuoteStream())
	}

	store, err := orderstore.NewKafkaStore(kafkaBrokers, id)
	if err != nil {
		panic(fmt.Errorf("failed to create order store: %v", err))
	}

	childOrderUpdates, err := executionvenue.GetChildOrders(id, kafkaBrokers, strategy.ChildUpdatesBufferSize)
	if err != nil {
		panic(err)
	}

	distributor := executionvenue.NewChildOrderUpdatesDistributor(childOrderUpdates)

	sm := strategy.NewStrategyManager(id, store, distributor, orderRouter, executeFn)

	api.RegisterExecutionVenueServer(s, sm)

	reflection.Register(s)

	port := "50551"
	fmt.Println("Starting Execution Venue Service on port:" + port)
	lis, err := net.Listen("tcp", "0.0.0.0:"+port)

	if err != nil {
		log.Fatalf("Error while listening : %v", err)
	}

	if err := s.Serve(lis); err != nil {
		log.Fatalf("error   while serving : %v", err)
	}

}
