#  Reflection
What reflection abilities are supported?
How is reflection used?

Java:
Java Reflection makes it possible to inspect classes, interfaces, fields and methods at runtime, without knowing the names of the classes, methods etc. at compile time. The required classes for reflection are provided under java.lang.reflect package.

C++:
A meta class type_id can be used to provide runtime information. The type_info class includes member functions for discovering the name of the type (name and raw_name), for comparing types (== and !=), and for determining the order of types in collating sequences. The standard C++ library also provides a global operator named typeid() that expects any expression as input and returns a constant reference to a type_info object representing the expression's type.
