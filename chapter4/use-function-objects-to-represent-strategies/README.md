#Pattern refer
- Strategy pattern 
#Keywords
- function object
#Summary
- a primary use of function pointer is to implement the Strategy pattern. To implement thsi pattern in java, declare an interface to represent the strategy, and a class that implements this interface for each concrete strategy.
When a concrete strategy is used only once, it is typically declared and instantiated as an anomymonous class. when a concrete strategy is designed for repeated use, it is generally implemented as a private static member vlass and exported in a public static final field whose type if the strategy inteface
