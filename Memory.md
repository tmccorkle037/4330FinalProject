#  Memory Management

Java:
Java objects are stored in the heap. The heap is created whenever the JVM is started and can increase and decrease in size as the program runs. When the heap is full, garbage is collected. The garbage collector  identifies and removes unused memory to free space for future use.  The heap is sometimes divided into two areas  called the nursery  and the old space. The nursery is a part of the heap reserved for allocation of new objects. When the nursery becomes full, garbage is collected by running a special young collection, where all objects that have lived long enough in the nursery are moved to the old space, thus freeing up the nursery for more object allocation. When the old space becomes full garbage is collected there, a process called an old collection. Java can also allocate memory in places other than the heap. Java does not use automatic reference counting becasue the garbage collector handles the memory management.

C++:
C++ does not have a garbage collector or use automatic reference counting. Memory management must be done manually by using the new and delete functions. The new function is used to dynamically allocate memory to the heap. When the object is done being used you must call the delete function to deallocate the memory. If this does not happen a memory leak will occur. 

