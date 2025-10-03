package com.eventBus;

public class Main {


     static void main(String[] args){

         WelcomeEmailListener emailListener = new WelcomeEmailListener();
         AnalyticsListener analyticsListener = new AnalyticsListener();
         EventBus eventBus = new EventBus();

         eventBus.register(emailListener);
         eventBus.register(analyticsListener);

        UserService userService = new UserService(eventBus);

        userService.registerUser("Anit");
    }
}
