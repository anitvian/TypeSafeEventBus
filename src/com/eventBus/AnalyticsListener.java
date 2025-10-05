package com.eventBus;

public class AnalyticsListener implements EventListener<UserRegisteredEvent>{

    @Override
    public void handleEvent(UserRegisteredEvent event) {
        System.out.println("Analytics Event Listened..... Success For - "+event.getUsername());
    }
}
