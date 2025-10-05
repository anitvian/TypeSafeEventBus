# Type-Safe Event Bus (In Progress)

A learning project where I build a simple **event-driven system** in Java from scratch.

---

## Current Progress

-- ✔ Manual event publishing and listeners implemented

- ✔ EventBus introduced for automatic listener management
- ✔ Listeners (`WelcomeEmailListener`, `AnalyticsListener`) registered dynamically
- ✔ `UserService` fully decoupled from listeners
- ✔ EventBus refactored to be **type-safe** and support **multiple event types**
- ✔ Added a second event (`UserDeletedEvent`) and verified **multi-event handling**
- ✔ Each event type triggers its respective listeners correctly
- ✔ Application successfully tested **end-to-end**

---

## Next Steps

🚧 Add asynchronous event dispatching using `ExecutorService`  
🚧 Introduce a global event logger to track all published events  
🚧 Write unit tests for `EventBus` and individual listeners  
🚧 Add error handling for failed or unregistered listeners

---

## Goal

Build a **type-safe, generic event bus** similar to **Spring’s ApplicationEventPublisher** or **Guava EventBus**,
capable of handling multiple event types and listeners dynamically.

