package com.eventBus;

public interface EventListener {

    public void handleEvent(UserRegisteredEvent event);
}
