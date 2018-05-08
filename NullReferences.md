#  Null References

Which does the language use? (null/nil/etc)
Does the language have features for handling null/nil references?

Java:
Java uses null. It is mainly used to indicate that no value is assigned to a reference variable.One way Java handles a null reference is by throwing a NullPointerException. THis exception gets thrown when the program atemepts to use an object reference that is null.

C++:
C++ uses null. Refrences in C++ must be non-null becasue you must initialize it when its being created. In genreral you should not have to check for a null refernce but to do so you must compare the address of the reference with NULL.  

