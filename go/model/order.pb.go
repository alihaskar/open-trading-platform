// Code generated by protoc-gen-go. DO NOT EDIT.
// source: order.proto

package model

import (
	fmt "fmt"
	proto "github.com/golang/protobuf/proto"
	math "math"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion3 // please upgrade the proto package

type Side int32

const (
	Side_BUY  Side = 0
	Side_SELL Side = 1
)

var Side_name = map[int32]string{
	0: "BUY",
	1: "SELL",
}

var Side_value = map[string]int32{
	"BUY":  0,
	"SELL": 1,
}

func (x Side) String() string {
	return proto.EnumName(Side_name, int32(x))
}

func (Side) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_cd01338c35d87077, []int{0}
}

type OrderStatus int32

const (
	OrderStatus_NONE      OrderStatus = 0
	OrderStatus_LIVE      OrderStatus = 1
	OrderStatus_FILLED    OrderStatus = 2
	OrderStatus_CANCELLED OrderStatus = 3
)

var OrderStatus_name = map[int32]string{
	0: "NONE",
	1: "LIVE",
	2: "FILLED",
	3: "CANCELLED",
}

var OrderStatus_value = map[string]int32{
	"NONE":      0,
	"LIVE":      1,
	"FILLED":    2,
	"CANCELLED": 3,
}

func (x OrderStatus) String() string {
	return proto.EnumName(OrderStatus_name, int32(x))
}

func (OrderStatus) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_cd01338c35d87077, []int{1}
}

type Order struct {
	Version              int32       `protobuf:"varint,1,opt,name=version,proto3" json:"version,omitempty"`
	Id                   string      `protobuf:"bytes,2,opt,name=id,proto3" json:"id,omitempty"`
	Side                 Side        `protobuf:"varint,3,opt,name=side,proto3,enum=model.Side" json:"side,omitempty"`
	Quantity             *Decimal64  `protobuf:"bytes,4,opt,name=quantity,proto3" json:"quantity,omitempty"`
	Price                *Decimal64  `protobuf:"bytes,5,opt,name=price,proto3" json:"price,omitempty"`
	ListingId            int32       `protobuf:"varint,6,opt,name=listingId,proto3" json:"listingId,omitempty"`
	RemainingQuantity    *Decimal64  `protobuf:"bytes,7,opt,name=remainingQuantity,proto3" json:"remainingQuantity,omitempty"`
	TradedQuantity       *Decimal64  `protobuf:"bytes,8,opt,name=tradedQuantity,proto3" json:"tradedQuantity,omitempty"`
	AvgTradePrice        *Decimal64  `protobuf:"bytes,9,opt,name=avgTradePrice,proto3" json:"avgTradePrice,omitempty"`
	Status               OrderStatus `protobuf:"varint,10,opt,name=status,proto3,enum=model.OrderStatus" json:"status,omitempty"`
	TargetStatus         OrderStatus `protobuf:"varint,11,opt,name=targetStatus,proto3,enum=model.OrderStatus" json:"targetStatus,omitempty"`
	Created              *Timestamp  `protobuf:"bytes,12,opt,name=created,proto3" json:"created,omitempty"`
	XXX_NoUnkeyedLiteral struct{}    `json:"-"`
	XXX_unrecognized     []byte      `json:"-"`
	XXX_sizecache        int32       `json:"-"`
}

func (m *Order) Reset()         { *m = Order{} }
func (m *Order) String() string { return proto.CompactTextString(m) }
func (*Order) ProtoMessage()    {}
func (*Order) Descriptor() ([]byte, []int) {
	return fileDescriptor_cd01338c35d87077, []int{0}
}

func (m *Order) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Order.Unmarshal(m, b)
}
func (m *Order) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Order.Marshal(b, m, deterministic)
}
func (m *Order) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Order.Merge(m, src)
}
func (m *Order) XXX_Size() int {
	return xxx_messageInfo_Order.Size(m)
}
func (m *Order) XXX_DiscardUnknown() {
	xxx_messageInfo_Order.DiscardUnknown(m)
}

var xxx_messageInfo_Order proto.InternalMessageInfo

func (m *Order) GetVersion() int32 {
	if m != nil {
		return m.Version
	}
	return 0
}

func (m *Order) GetId() string {
	if m != nil {
		return m.Id
	}
	return ""
}

func (m *Order) GetSide() Side {
	if m != nil {
		return m.Side
	}
	return Side_BUY
}

func (m *Order) GetQuantity() *Decimal64 {
	if m != nil {
		return m.Quantity
	}
	return nil
}

func (m *Order) GetPrice() *Decimal64 {
	if m != nil {
		return m.Price
	}
	return nil
}

func (m *Order) GetListingId() int32 {
	if m != nil {
		return m.ListingId
	}
	return 0
}

func (m *Order) GetRemainingQuantity() *Decimal64 {
	if m != nil {
		return m.RemainingQuantity
	}
	return nil
}

func (m *Order) GetTradedQuantity() *Decimal64 {
	if m != nil {
		return m.TradedQuantity
	}
	return nil
}

func (m *Order) GetAvgTradePrice() *Decimal64 {
	if m != nil {
		return m.AvgTradePrice
	}
	return nil
}

func (m *Order) GetStatus() OrderStatus {
	if m != nil {
		return m.Status
	}
	return OrderStatus_NONE
}

func (m *Order) GetTargetStatus() OrderStatus {
	if m != nil {
		return m.TargetStatus
	}
	return OrderStatus_NONE
}

func (m *Order) GetCreated() *Timestamp {
	if m != nil {
		return m.Created
	}
	return nil
}

func init() {
	proto.RegisterEnum("model.Side", Side_name, Side_value)
	proto.RegisterEnum("model.OrderStatus", OrderStatus_name, OrderStatus_value)
	proto.RegisterType((*Order)(nil), "model.Order")
}

func init() { proto.RegisterFile("order.proto", fileDescriptor_cd01338c35d87077) }

var fileDescriptor_cd01338c35d87077 = []byte{
	// 377 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x74, 0x92, 0x4d, 0xeb, 0xd3, 0x40,
	0x10, 0xc6, 0x4d, 0x9a, 0x97, 0x66, 0xf2, 0x6f, 0x49, 0xe7, 0xb4, 0x8a, 0x60, 0xf0, 0x20, 0x21,
	0x48, 0x0f, 0x55, 0x8a, 0x07, 0x11, 0x6c, 0x1b, 0xa1, 0x10, 0x5a, 0x4d, 0xab, 0xa0, 0xb7, 0x35,
	0xbb, 0x84, 0x85, 0x26, 0xa9, 0x9b, 0x6d, 0xc1, 0x6f, 0xe0, 0xc7, 0x96, 0x6c, 0xda, 0x6a, 0x95,
	0x9c, 0xc2, 0xcc, 0xf3, 0x7b, 0x66, 0x26, 0x3b, 0x03, 0x7e, 0x2d, 0x19, 0x97, 0xd3, 0xa3, 0xac,
	0x55, 0x8d, 0x76, 0x59, 0x33, 0x7e, 0x78, 0x32, 0xd1, 0x9f, 0xbc, 0x2e, 0xcb, 0xba, 0xea, 0x94,
	0xe7, 0xbf, 0x2c, 0xb0, 0xb7, 0x2d, 0x89, 0x04, 0xdc, 0x33, 0x97, 0x8d, 0xa8, 0x2b, 0x62, 0x84,
	0x46, 0x64, 0x67, 0xd7, 0x10, 0xc7, 0x60, 0x0a, 0x46, 0xcc, 0xd0, 0x88, 0xbc, 0xcc, 0x14, 0x0c,
	0x9f, 0x81, 0xd5, 0x08, 0xc6, 0xc9, 0x20, 0x34, 0xa2, 0xf1, 0xcc, 0x9f, 0xea, 0xaa, 0xd3, 0x9d,
	0x60, 0x3c, 0xd3, 0x02, 0xbe, 0x84, 0xe1, 0x8f, 0x13, 0xad, 0x94, 0x50, 0x3f, 0x89, 0x15, 0x1a,
	0x91, 0x3f, 0x0b, 0x2e, 0xd0, 0x8a, 0xe7, 0xa2, 0xa4, 0x87, 0xf9, 0xeb, 0xec, 0x46, 0xe0, 0x0b,
	0xb0, 0x8f, 0x52, 0xe4, 0x9c, 0xd8, 0x3d, 0x68, 0x27, 0xe3, 0x53, 0xf0, 0x0e, 0xa2, 0x51, 0xa2,
	0x2a, 0xd6, 0x8c, 0x38, 0x7a, 0xc4, 0x3f, 0x09, 0x7c, 0x07, 0x13, 0xc9, 0x4b, 0x2a, 0x2a, 0x51,
	0x15, 0x9f, 0xae, 0xcd, 0xdd, 0x9e, 0x8a, 0xff, 0xa3, 0xf8, 0x06, 0xc6, 0x4a, 0x52, 0xc6, 0xd9,
	0xcd, 0x3c, 0xec, 0x31, 0xff, 0xc3, 0xe1, 0x1c, 0x46, 0xf4, 0x5c, 0xec, 0xdb, 0xe4, 0x47, 0xfd,
	0x1f, 0x5e, 0x8f, 0xf1, 0x1e, 0xc3, 0x18, 0x9c, 0x46, 0x51, 0x75, 0x6a, 0x08, 0xe8, 0x87, 0xc4,
	0x8b, 0x41, 0xaf, 0x63, 0xa7, 0x95, 0xec, 0x42, 0xe0, 0x1c, 0x1e, 0x14, 0x95, 0x05, 0x57, 0x5d,
	0x9e, 0xf8, 0xbd, 0x8e, 0x3b, 0x0e, 0x63, 0x70, 0x73, 0xc9, 0xa9, 0xe2, 0x8c, 0x3c, 0xdc, 0x4d,
	0xb5, 0x17, 0x25, 0x6f, 0x14, 0x2d, 0x8f, 0xd9, 0x15, 0x88, 0x1f, 0x83, 0xd5, 0xee, 0x10, 0x5d,
	0x18, 0x2c, 0x3e, 0x7f, 0x0d, 0x1e, 0xe1, 0x10, 0xac, 0x5d, 0x92, 0xa6, 0x81, 0x11, 0xbf, 0x05,
	0xff, 0xaf, 0x1e, 0xad, 0xb0, 0xd9, 0x6e, 0x92, 0x0e, 0x49, 0xd7, 0x5f, 0x92, 0xc0, 0x40, 0x00,
	0xe7, 0xc3, 0x3a, 0x4d, 0x93, 0x55, 0x60, 0xe2, 0x08, 0xbc, 0xe5, 0xfb, 0xcd, 0x32, 0xd1, 0xe1,
	0x60, 0xe1, 0x7e, 0xeb, 0xee, 0xef, 0xbb, 0xa3, 0x6f, 0xee, 0xd5, 0xef, 0x00, 0x00, 0x00, 0xff,
	0xff, 0x41, 0x64, 0x57, 0xef, 0x9c, 0x02, 0x00, 0x00,
}
