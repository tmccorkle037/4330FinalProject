#  Interfaces
Java:
Interfaces form a contract between the class and the outside world, and this contract is enforced at build time by the compiler. Implementing an interface allows a class to become more formal about the behavior it promises to provide. An interface has related methods with no bodies. To use an interface with your class, you must use the implements keyword followed by the name of the interface. When a class implements an interface, all methods from the interface must be present in the class. Interfaces cannot be instantiated, and they can only be extended by other interfaces. 

C++:
C++ has no built in concept of interfaces. A way to use the concept of an interface is by creating pure virtual functions in an abstract class. Pure virtual functions are similar to the functions in an interface becasue they do not conatin a method body, so they must be defined in the derived class. The purpose of an abstract class is to provide an appropriate base class from which other classes can inherit. Abstract classes cannot be used to instantiate objects and serves only as an interface.



What does the language support?
What abilities does it have?
How is it used?
