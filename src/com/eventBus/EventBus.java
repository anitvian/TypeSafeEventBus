package com.eventBus;

import java.util.ArrayList;

import java.util.List;

public class EventBus {
    List<EventListener> listenerList = new ArrayList<>();

    public void register(EventListener eventListener){
        listenerList.add(eventListener);
        System.out.println(eventListener.getClass().getName()+" Registered");
    }

    public void publish(UserRegisteredEvent userRegisteredEvent){
        for(EventListener listener :listenerList){
            listener.handleEvent(userRegisteredEvent);
        }
    }

}
