package marketdatasource

import (
	"github.com/ettec/otp-common/marketdata"
	"github.com/ettec/otp-common/model"
	"log"
	"sync"
	"time"
)

type MdsConnection struct {
	partyIdToConnection map[string]marketdata.ConflatedQuoteConnection
	quoteDistributor    marketdata.QuoteDistributor

	connMux          sync.Mutex
	maxSubscriptions int
}

func NewMdsConnection(id string, marketGatewayAddress string, maxReconnectInterval time.Duration,
	maxSubscriptions int) (*MdsConnection, error) {

	stream, err := marketdata.NewQuoteStreamFromMdSource(id, marketGatewayAddress, maxReconnectInterval, 1000)

	if err != nil {
		return nil, err
	}

	qd := marketdata.NewQuoteDistributor(stream, 1000)
	gateway := &MdsConnection{partyIdToConnection: make(map[string]marketdata.ConflatedQuoteConnection), quoteDistributor: qd,
		maxSubscriptions: maxSubscriptions}

	return gateway, nil
}

func (s *MdsConnection) GetConnection(partyId string) (marketdata.ConflatedQuoteConnection, bool) {
	s.connMux.Lock()
	defer s.connMux.Unlock()

	con, ok := s.partyIdToConnection[partyId]
	return con, ok
}

func (s *MdsConnection) AddConnection(subscriberId string, out chan<- *model.ClobQuote) marketdata.ConflatedQuoteConnection {
	s.connMux.Lock()
	defer s.connMux.Unlock()

	if conn, ok := s.partyIdToConnection[subscriberId]; ok {
		log.Printf("connection for client %v already exists, closing existing connection.", subscriberId)
		conn.Close()
		log.Print("connection closed:", subscriberId)
	}

	cc := marketdata.NewConflatedQuoteConnection(subscriberId, s.quoteDistributor.GetNewQuoteStream(),
		out, s.maxSubscriptions)

	s.partyIdToConnection[subscriberId] = cc

	return cc
}
