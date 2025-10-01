package com.eventBus;

public class Main {


    public static void main(String[] argx){

         WelcomeEmailListener emailListener = new WelcomeEmailListener();
         AnalyticsListener analyticsListener = new AnalyticsListener();

        UserService userService = new UserService(emailListener,analyticsListener);

        userService.registerUser("Anit");
    }
}
