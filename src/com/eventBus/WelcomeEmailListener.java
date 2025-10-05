package com.eventBus;

public class WelcomeEmailListener implements EventListener<UserRegisteredEvent>{

    public void handleEvent(UserRegisteredEvent event){

        System.out.println("Sending Welcome Email to User - "+event.getUsername());
    }
}
