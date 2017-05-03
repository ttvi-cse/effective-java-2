#Items refer
- Item 20: Prefer class hierachies to tagged classes
- Item 5: 
- Item 9: Always override hashCode when you override equals
- Item 16: Favor composition over inheritance
- Item 15: When you write a class, think hard about whether it should be immutable
#Keywords
- Liskov substitution principle: any important property of a type should also hold for its subtype, so that any method written for the type should work equally well on its subtype
#Sumary
- Consitency
- Non-nullity
- High-quality equals method:
+ Use the == operator to check if the argument is a reference to this object
+ Use the instanceof operator to check if the argument has the correct type
+ Cast the argument to te correct type
+ For each "significant" field in the class, check if that field of the argument matches the corresponding field of this object
+ When you are finished writing your equals method, ask yourself three questions: Is it symmetric? Is it transitive? Is it consistent?
#Issues
- Does interface have fields?
- Why interface's field can not be access directly?
#Note:
- primitive whose type is not float or double use ==
- float use Float.compare, Doule use Double.compare
- Arrays.equals
- Don't try to be too clever
- Don't substitute another type for Object in the equals declaration

