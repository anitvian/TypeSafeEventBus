package com.eventBus;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventBus {
    private final Map<Class<?>, List<EventListener<?>>> listeners = new HashMap<>();

    public <T> void register(Class<T> eventType, EventListener<T> eventListener ){
         listeners.computeIfAbsent(eventType, k -> new ArrayList<>()).add(eventListener);

        System.out.println(eventListener.getClass().getName()+" Registered " + eventType.getSimpleName());
    }

    public <T> void publish( T event){
        List<EventListener<?>> eventListeners = listeners.get(event.getClass());

        if (eventListeners != null) {
            for (EventListener<?> listener : eventListeners) {

                @SuppressWarnings("unchecked")
                EventListener<T> typedListener = (EventListener<T>) listener;

                typedListener.handleEvent(event);
            }
        }
        else {
            System.out.println("No listeners found for event: " + event.getClass().getSimpleName());
        }
    }

}
