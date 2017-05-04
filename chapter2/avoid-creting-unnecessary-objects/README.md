#How to use
- You can often avoid creating unnecessary objects by using static factory methods.
- prefer primitives to boxed primitives, and watch out for unintentional autoboxing
- avoiding object creation by maintaining your own object pool is a bad idead unless the objects in the poll are extremely heavyweight
#Problems
- It would be possible to eliminate the unnecessary initializations by lazily initializing these fields (Item 71)
# Items refer
- Item 39: defensive copying
- Item 5: Don't reuse an existing object when you should create a new one
