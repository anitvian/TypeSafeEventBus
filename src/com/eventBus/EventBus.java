package com.eventBus;

import java.util.ArrayList;

import java.util.List;

public class EventBus<T> {
    List<EventListener<T>> listenerList = new ArrayList<>();

    public void register(EventListener<T> eventListener){
        listenerList.add(eventListener);
        System.out.println(eventListener.getClass().getName()+" Registered");
    }

    public void publish( T event){
        for(EventListener<T> listener :listenerList){
            listener.handleEvent(event);
        }
    }

}
