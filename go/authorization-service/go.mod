module github.com/ettech/open-trading-platform/go/authorization-service

go 1.13

require (
	github.com/envoyproxy/go-control-plane v0.9.5
	github.com/ettec/open-trading-platform/go/common v0.0.0
	github.com/ettec/open-trading-platform/go/model v0.0.0
	github.com/gogo/googleapis v1.4.0
	github.com/golang/protobuf v1.4.0
	github.com/google/uuid v1.1.1
	github.com/lib/pq v1.2.0
	google.golang.org/genproto v0.0.0-20190819201941-24fa4b261c55
	google.golang.org/grpc v1.25.1
)

replace github.com/ettec/open-trading-platform/go/common v0.0.0 => ../common

replace github.com/ettec/open-trading-platform/go/model v0.0.0 => ../model