#  Implementation of Event handlers

Java:
Changing the state of an object is known as an event. For example, click on button, dragging mouse etc. The java.awt.event package provides many event classes and Listener interfaces for event handling. To perform evet handling you must register the compnent with the Listener. The event handler can be put within the class, in another class, or in an anonymous class.i

C++:
Event handling for classes that do not implement COM objects has been deprecated for C++. Now event handling is primarily supported for COM classes. Event handling supports single- and multithreaded usage and protects data from simultaneous multithread access. It also allows you to derive subclasses from event source or receiver classes and support extended event sourcing/receiving in the derived class. In an event receiver class, you define event handlers, which are methods with signatures that match the event that they will handle.
