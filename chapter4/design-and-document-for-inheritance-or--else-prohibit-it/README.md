#Note
- the class must document its self-use of overridable methods
#Problems

#Solve
- the only way to test a class designed for inheritance is to write subclasses.
- must test your class by writing subclasses before you release it
- constructors must not invoke overridable methods
- the best solution to this problem is to prohibit subclassing in classes that are not designed and documented to be safely subclassed


