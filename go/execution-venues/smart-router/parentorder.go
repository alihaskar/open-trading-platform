package main

import "github.com/ettec/open-trading-platform/go/model"

type parentOrder struct {
	model.Order
	childOrders map[string]*model.Order
}

func newParentOrder(order model.Order) *parentOrder {

	return &parentOrder{
		order,
		map[string]*model.Order{},
	}
}

func (po *parentOrder) onChildOrderUpdate(childOrder *model.Order) {

	var lastExecSeqNo int32

	if previous, ok := po.childOrders[childOrder.Id]; ok {
		lastExecSeqNo = previous.LastExecSeqNo
	}

	if childOrder.LastExecSeqNo > lastExecSeqNo {
		execId := childOrder.Id + ":" + childOrder.LastExecId
		po.AddExecution(*childOrder.LastExecPrice, *childOrder.LastExecQuantity, execId)
	}

	po.childOrders[childOrder.Id] = childOrder

	exposedQnt := model.IasD(0)
	for _, order := range po.childOrders {
		if !order.IsTerminalState() {
			exposedQnt.Add(order.RemainingQuantity)
		}

		if !po.ExposedQuantity.Equal(exposedQnt) {
			po.ExposedQuantity = exposedQnt
		}
	}

	if po.GetTargetStatus() == model.OrderStatus_CANCELLED {
		if po.GetExposedQuantity().Equal(zero) {
			po.SetTargetStatus(model.OrderStatus_NONE)
			po.SetStatus(model.OrderStatus_CANCELLED)
		}
	}

}