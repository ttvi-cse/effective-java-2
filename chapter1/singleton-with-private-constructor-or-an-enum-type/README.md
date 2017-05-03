#Advance
#Disadvance
- Making a class a singleton can make it difficult to test its clients
#Keywords
- monoelvistic
- Item 53: a privileged client can invoke the private constructor reflectively
with the aid of the AccessibleObject.setAccesible method.
- serializable 
#Patterns
#Issues
- To maintain the singleton guarantee, you have to declare all instance fields transient and provide a readResolve method
