package com.eventBus;

public class UserRegisteredEvent {
    private String username;

    public String getUsername() {
        return username;
    }

    public UserRegisteredEvent(String username) {
        this.username = username;
    }
}
