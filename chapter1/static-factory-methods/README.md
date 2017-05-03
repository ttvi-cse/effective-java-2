- Advantage
 + One advantage of static fatory methods is that, unlike constructors, they have names
 + A second advantage of static factory  methods is that, unlike constructors they are not required to create a new object each time they're invoked
 + A third advantage of static factory methods is that, unlike constructors, they can return an object of any subtype of their return type
 + A fourth advantage of static factory methods is that they reduce the verbosity of creating parameterized type instances.

- Disadvantage
 + Providing only static factory methods is that class without public or protected constructors cannot be subclassed
 + They are not readily distinguishable from other static methods

- Common names
 + valueOf
 + of
 + getInstance
 + newInstance
 + getType
 + newType

- Summary: static factory methods and public constructors both have their uses, and it pays to understand their relative merits. Often static factories are preferable, so aboud the reflex to provide public constructors without first considering static factories.

- Keywords in this chapter
+ service provider frameworks
+ service interface, provider registration API, service access API, service provider interface,
+ type inference

- Pattern remind in this chapter
+  Service provider framework pattern
+ Adapter pattern

