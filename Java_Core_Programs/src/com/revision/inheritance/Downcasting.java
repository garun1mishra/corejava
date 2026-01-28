package com.revision.inheritance;

class Parent1 {   
    String name;   
    
    // A method which prints the data of the parent class   
    void showMessage()   
    {   
        System.out.println("Parent method is called");   
    }   
}   
    
// Child class   
class Child1 extends Parent1 {   
    int age;   
    
    // Performing overriding  
    @Override  
    void showMessage()   
    {   
        System.out.println("Child method is called");   
    }   
}   
    

public class Downcasting {

	public static void main(String[] args) {
		Parent1 p = new Child1();  
        p.name = "Shubham";  
        // Performing Downcasting Implicitly   
//        Child1 c =(Child1) new Parent1(); // it gives compile-time error   
          
        // Performing Downcasting Explicitly   
        Child1 c = (Child1)p;   
    
        c.age = 18;   
        System.out.println(c.name);   
        System.out.println(c.age);   
        c.showMessage();   

	}

}
