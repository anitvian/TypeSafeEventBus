# Type-Safe Event Bus (In Progress)

A learning project where I build a simple event-driven system in Java from scratch.

## Current Progress
✅ Manual event publishing and listeners  
🚧 Next: Introduce EventBus for automatic listener management

## Goal
Build a type-safe, generic event bus similar to Spring’s ApplicationEventPublisher or Guava EventBus.
# Type-Safe Event Bus (In Progress)

A learning project where I build a simple **event-driven system** in Java from scratch.

---

## Current Progress
✅ Manual event publishing and listeners implemented  
✅ EventBus added for automatic listener management  
✅ Listeners (WelcomeEmailListener, AnalyticsListener) registered with EventBus  
✅ UserService decoupled from listeners

---

## Next Steps
🚧 Refactor EventBus to be **generic and type-safe**  
🚧 Support multiple event types beyond `UserRegisteredEvent`  
🚧 Add more listeners to demonstrate scalability

---

## Goal
Build a **type-safe, generic event bus** similar to **Spring’s ApplicationEventPublisher** or **Guava EventBus**, capable of handling multiple event types and listeners dynamically.

