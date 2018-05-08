/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass;

import static java.lang.Boolean.TRUE;

/**
 *
 * @author tessmccorkle
 */
public class Class extends SuperClass implements NewInterface{
    private int age;
    public String name;
    
   public Class(String name) {  //constructor with string parameter
      // This constructor has one parameter, name.
      System.out.println("Passed Name is :" + name );
      this.name = name;
   }
   
   void setAge(int age){
       this.age = age;
   }
   
   int getAge(){
       return age;
   }
   
   @Override
    public void display() {
        System.out.println(name);
    }

   public static void main(String []args) {
      // Following statement would create an object myPuppy
      Class myClass = new Class( "tommy" ); //when the object is no longer used, the garbage collector deallocates this memory
      myClass.setAge(15);   //using setter
      System.out.println("The age is: " + myClass.getAge()); //using getter to acces private member value
      System.out.println("The value of x from the superclass is: " + myClass.x);
      myClass.display();
      
      //Examples of different java types
      int a = 3;
      int b = 5;
      double c = 4.6;
      boolean bool = TRUE;
              
      //comparing ints using the == operator
      if( a == b ){
          System.out.println( a + " is not equal to " + b);
      }
      else{
        System.out.println( a + " is not equal to " + b);   
      }
      
      String myString = "Dog";
      String myString2 = "Dog";
      
      //comparing strings using the .equals method
      if(myString.equals(myString2)){
          System.out.println( myString + " is equal to " + myString2);
      }
      
      
   }
   
}
   
