#  Singleton

How is a singleton implemented?
Can it be made thread-safe?
Can the singleton instance be lazily instantiated?

Java:
A singleton is created by making the constructor private, and writing a static method that has a return type of the Singleton class. To make a singleton class thread-safe, the getInstance() method is made synchronized so that multiple threads can't access it simultaneously. A singleton instance can be lazily instantiated. When the instance is created in a global access method, this is considered lazy initialization. If you use a lazy initialization method, the singleton will not be thread safe becasue both threads will get the different instances the singleton class. 

C++:
A singleton is implememted by defining a private static attribute in the "single instance" class. Next you must define a public static accessor function in the class. Do "lazy initialization" in the accessor function
Define all constructors to be protected or private. Clients may only use the accessor function to manipulate the Singleton. Inheritance can be supported, but static functions may not be overridden. The base class must be declared a friend of the derived class.



