package com.eventBus;

public class UserService {

    private EventBus eventBus;

    public UserService(EventBus eventBus){
        this.eventBus = eventBus;
    }

    public void registerUser(String username){

        System.out.println("User Registered - "+username);
        UserRegisteredEvent event = new UserRegisteredEvent(username);
        eventBus.publish(event);

    }

    public void userOrder(String orderId){
        System.out.println("Order Placed - "+orderId);
        OrderPlacedEvent event = new OrderPlacedEvent(orderId);
        eventBus.publish(event);
    }
}
