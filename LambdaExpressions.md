#  Lambda Expressions

Java:
A Java lambda expression is a function which can be created without belonging to any class. If you have an interface with only one method, a lambda expression can be used. A lambda expression can also be passed around as if it was an object and executed on demand. 

C++:
C++11 now supports lambda expressions. The syntax for a lambda expression is to use the capture specification [] at the start of every lamba expression. The empty [] tells the compiler not to capture any variables, whereas the [&] specification tells the compiler to perform variable capture. Next you must include the argument list inside parenthesis. Lambdas do not require a return type becasue the compiler can automatically deduce it. You call the lambda expression by calling the method func(). 
