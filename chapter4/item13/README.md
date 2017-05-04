#Note
- If a method overrides a supper class method, it is not permited to have a lower access level in the subclass than it does in the superclass
- Member of an interface are implicitly public 
- Instance fields should never be public (Item 14)
- classes with public mutable fields are not thread-safe
- it is wrong for a class to have a public static fianl array field, or an accessor that returns such a field
- Ensure that objects referenced by public static final fields are immutable

