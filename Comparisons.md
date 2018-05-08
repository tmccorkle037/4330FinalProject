#  Comparisons

Java:
The two operators that can be used with object references are comparing for equality (==) and inequality (!=). These operators compare two values to see if they refer to the same object. == can cause errors because even if an object has the same value, they might not refer to the same thing, and the statement will be false. The equals() method is used to campare the values of objects. The compares method can also be used. 

C++:
C++ compares things in the same way Java does. You can use the == operator, but it is better to use .compare(). The compare() method returns int, while relational operators return a boolean value. A single Relational operator is unique to a certain operation, while compare() can perform lots of different operations alone, based on the type of arguments passed. You can compare any substring at any position in a given string using compare(), which otherwise requires the long procedure of word by word extraction of string for comparison using relational operators.
