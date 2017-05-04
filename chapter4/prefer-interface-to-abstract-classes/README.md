#Problem
#Note
- Existing classes can be easily retrofitted to implement a new interface
- Interfaces are ideal for defining mixins
- Intefaces allow the construction of nonhierachical type frameworks
- Intefaces enable safe, powerful functionality enhancements
- You can combine the virtues of interfaces and abstract classes by provifing an sbstract skeletal implementation class to go with each nontrivial interface that you export
#Summarize
- an inteface is generally the best way to define a type that permits multiple implementation. An exception to this rule is the case where ease of evolution is deemed more important than flexibility and power. Under these circumstances, you should use an abstract class to define the type, but only if you understand and can accept the limitations. If you export a nontrivial interface, you should strongly consider providing a skeletal implementation to go with it. Finally, you should design all of your public interfaces with the utmost care and test them throughly by writing multiple implementations

