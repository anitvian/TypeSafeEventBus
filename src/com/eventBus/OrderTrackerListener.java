package com.eventBus;

public class OrderTrackerListener implements EventListener<OrderPlacedEvent>{
    @Override
    public void handleEvent(OrderPlacedEvent orderPlacedEvent) {
        System.out.println("Order Tracker Listener Started - " + orderPlacedEvent.getOrderId());
    }
}
