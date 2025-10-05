package com.eventBus;

public class OrderPlacedEvent {

    private final String orderId;

    public String getOrderId() {
        return orderId;
    }

    public OrderPlacedEvent(String orderId) {
        this.orderId = orderId;
    }
}
