# To make a class immutable, follow these five rules:
1. Don't provide any methods that modify the object's state (known as mutators)
2. Ensure that the class can't be extended.
3. Make all firlds final
4. Make all fields private 
5. Ensure exclusive access to any mutable components. defensive copies (Item 39) in constuctors, accessors, readObject methods (Item 76)
#Note
- Immutable objects are simple
- Immutable objects are inherantly thread-safe; they require no synchronization
- immutable objects can be shared freely
- not provide a clone method or conpy constructor on an immytable calss
- Not only can you share immytable objects, but ou can share their internals
- immytable objcts make great building blocks for other objects
- The only readl disadvantage of immutable classes is that they require a separate object for each distinct value
#Summary
- Classes should be immutable unless there's a very good reason to make them mutable.
- If a class can not be made immutable, limit its mutablity as much as possible
- make every field final unless there is a compelling reson to make it nonfinal

