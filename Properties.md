#  Properties
Getters and setters…write your own or built in?
Backing variables?
Computed properties?


Java: 
Getters and setters can be used to access private members from outside the class. You must write your own getters and setters. A getter has no parameters and returns the value of the member while setters take in parameters and let you set the value. Java does not use backing variables or computed properties.

C++:
You can create getters and setters, but C++ also has friend classes or functions that are used to access private and protected members. Friends are functions or classes declared with the friend keyword.
A non-member function can access the private and protected members of a class if it is declared a friend of that class. That is done by including a declaration of this external function within the class, and preceding it with the keyword friend.  C++ does not use backing variables oor computed properties.

