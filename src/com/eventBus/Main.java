package com.eventBus;

public class Main {


     static void main(){


         EventBus eventBus = new EventBus();

         eventBus.register(UserRegisteredEvent.class, new WelcomeEmailListener());
         eventBus.register(UserRegisteredEvent.class,new AnalyticsListener());
         eventBus.register(OrderPlacedEvent.class,new OrderTrackerListener());

        UserService userService = new UserService(eventBus);

        userService.registerUser("Anit");
        userService.userOrder("0414");
    }
}
