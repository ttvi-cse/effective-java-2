#Note
- one common use of a static member class is a public helper class, useful only in conjunction with its outer class.
- it is impossible to create an instance of a nonstatic member class without an enclosing enstance.
- if you decalre a member class that does not require access to an enclosing instance, always put the static modifier in its declaration
- a common use of private static member classes is to represent components of the object represented by their enclosing class.
- anomymonus classes occur int the midst of expressions, they must be kept short about ten lines or fewer - or readability will sufer
- one common use of a anomymonus classes is to create function objects (item 21)
- another common use of anomymous classes is to create process objects, such as 
Runnable, Thread, or TimerTask
- third common use is within static factory methods 
- local classes are the least frequently used of the four kinds of nested class.
#Pattern refer
- Adapter 
# Item refer
- Item 30: consider an enum descibing the operations supported by a calculator
#Summary
- there are four different inds of nested classes, and each has tis place. If a nested clas needs to be visible outside of a single method or is too long to fit comfortably inside a method, use a member class. If each instance of the member class needs a reference to its enclosing instance, make it nonstatic; otherwise, make it static. Assuming the class belongs inside a method, if you need to create instances from only one location and there is a preexisting type that caracterizes the class, make it an anomymous class; otherwise make it a local class
