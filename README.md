
# Type-Safe Event Bus (In Progress)

A learning project where I build a simple **event-driven system** in Java from scratch.

---

## Current Progress
- ✔ Manual event publishing and listeners implemented
- ✔ EventBus introduced for automatic listener management
- ✔ Listeners (`WelcomeEmailListener`, `AnalyticsListener`) registered dynamically
- ✔ `UserService` fully decoupled from listeners
- ✔ EventBus made **generic and type-safe** using `<T>`
- ✔ Application tested successfully with `UserRegisteredEvent`

---

## Next Steps
🚧 Support multiple event types beyond `UserRegisteredEvent`  
🚧 Add more listeners to demonstrate scalability

---

## Goal
Build a **type-safe, generic event bus** similar to **Spring’s ApplicationEventPublisher** or **Guava EventBus**, capable of handling multiple event types and listeners dynamically.

