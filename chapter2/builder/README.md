#Advance
- A minor advantage of builders over constructors is that builders can have multiple varargs parameters
#Disadvance
##Telescoping
- Hard to write client code when there are many parameters, and harder still to read it
##Java Bean
- JavaBeans pattern precludes the possibility of making a class immutable
- Requuires added efford on the part of the programmer to ensure thread safety
#Summary
- Builder pattern is a good choice when designing classes whose constructors or static factories would have more than a handful of parameters. expecially if most of those parameter are optional
#Keywords
- IllegalStateException
- bounded wildcard type
#Pattern
- telescoping constructor
- javabean pattern
- Abstract Factory
