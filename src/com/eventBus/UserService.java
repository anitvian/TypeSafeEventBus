package com.eventBus;

public class UserService {

    private WelcomeEmailListener emailListener;
    private AnalyticsListener analyticsListener;

    public UserService(WelcomeEmailListener emailListener, AnalyticsListener analyticsListener) {
        this.emailListener = emailListener;
        this.analyticsListener = analyticsListener;
    }

    public void registerUser(String username){

        System.out.println("User Registered - "+username);
        UserRegisteredEvent event = new UserRegisteredEvent(username);

        emailListener.handleEvent(event);
        analyticsListener.handleEvent(event);

    }
}
