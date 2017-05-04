#Notes
- Unlike method invocation, inheritance violates encapsulation
#Problem
- The supperclass's implementation may change from release to release, and if it does, the subclass may break, even though its code hash not been touched
#Summary
- inheritance is powerful, but it is problematic because it violates encapsulation. It is appropriate only when a genuine subtype relationship exists betweem the subclass and the superclass. Even then, inheritance may lead to fragility if the subcass is in a different package from the superclass and the superclass is not designed for inheritance. To avoid this fragility, use composition and forwarding instead of inheritance, especially if an appropriate interface to implement a wrapper class exists. Not only are wrapper clases more robust than subclasses, they are also more powerful

