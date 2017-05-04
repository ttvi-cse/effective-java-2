#Item
- Item 18: Cloneable interface was intended as a mixin interface for objects to advertise that they permit cloning.
- Item 53: reflection
#How to use
- if you override the clone method in a nonfinal clas, you should return an object obtained by invoking super.clone
- Inpractiice, a class that implements Cloneable is sexpected to provide a properly functioning public clone method.
#Summary
- A fine approach to object copyiing is to provide a copy constructor or copy factory.
- never to override the clone method and never to invoke it except, perhaps, to copy arrays
