#include <iostream>  
using namespace std;  
class Employee { 
	string lastName; 
   public:  
       int id; //data member (also instance variable)      
       string name; //data member(also instance variable)  
       float salary; 
	void setLastName(string lastName){	//setter for lastName
		this->lastName = lastName;
	} 
	string getLastName(){	//getter for lastName,
		return lastName;
	}	
       Employee(int id, string name, float salary)    
        {    
             this->id = id;    
            this->name = name;    
            this->salary = salary;   
        }    
       void display()    
        {    
            cout<<id<<"  "<<name<<"  "<<salary<<endl;    
        }    
};  
int main(void) {  
    Employee e1 =Employee(101, "Sonoo", 890000); //creating an object of Employee   
    Employee e2=Employee(102, "Nakul", 59000); //creating an object of Employee  
    e1.display();    
    e2.display();    
    e2.setLastName("Smith");
    cout << e2.getLastName() << endl;
    return 0;  
}  
