#  Inheritance

Java:
In the Java language, classes can be derived from other classes, thereby inheriting fields and methods from those classes. When you want to create a new class and there is already a class that includes some of the code that you want, you can derive your new class from the existing class. In doing this, you can reuse the fields and methods of the existing class without having to write them yourself. A subclass inherits all public and protected members from its superclass. Constructors are not members, so they are not inherited by subclasses, but the constructor of the superclass can be invoked from the subclass. A subclass can override methods that it inherits, or it can hide fields or methods that it inherits. To use inheritacnce you must use the extends keyword in the class definition. 

C++:
The capability of a class to derive properties and characteristics from another class is called Inheritance. In C++ there are different modes of inerheritance. These modes include public protected and private.  If you derive a sub class from a public base class then the public members of the base class will become public in the derived class and protected members of the base class will become protected in derived class. Private members of the base class will never get inherited in sub class. If you derive a sub class from a Protected base class then both public member and protected members of the base class will become protected in derived class. If you derive a sub class from a private base class then both public member and protected members of the base class will become private in derived class.


