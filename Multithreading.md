#  Multithreading

Threads or thread-like abilities
How is multitasking accomplished?

Java:
In Java there are 2 ways to create a thread. One way is to implement the Runnable interface. The Runnable interface defines a single method, run, meant to contain the code executed in the thread. The other  way to create a thread is to extend the Thread class. When you extend the Thread calss this allows you to overricde the run method. Whichever way you choose, the Thread.start() method must be called to start a new thread. Multithreading is accomplished by running multiple threads at the same time. SInce Java is a mulitthreaded programming language this is possible.

C++:
Multithreading support was introduced in C++11. Prior to C++11, you had to use POSIX threads or p threads library in C. The thread classes and related functions are defined in the thread header file. To start a thread you need to create a new thread object and pass the executing code to be called into the constructor of the object. Once the object is created a new thread is launched which will execute the code specified in callable. A callable can be a function pointer, a function object, or a lambda expression.



