package com.eventBus;

public interface EventListener<T> {

     void handleEvent(T event);
}
