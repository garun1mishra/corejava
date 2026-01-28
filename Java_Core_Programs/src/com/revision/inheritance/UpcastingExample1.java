/**
 * 
 */
package com.revision.inheritance;

/**
 * @author Garun Mishra
 * 
 */

class  Parent{  
	
	int i =0; 
	   void PrintData() {  
	      System.out.println("method of parent class");  
	   }  
	}  
	  
	class Child extends Parent {  
		int j=10;
		int i=20;
	   void PrintData() {  
	      System.out.println("method of child class");  
	   }  
	}  


public class UpcastingExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Parent obj1 = (Parent) new Child();  
	      Parent obj2 = (Parent) new Child();   
	      obj1.PrintData();  
	      obj2.PrintData();  
	      System.out.println(obj1.i);
//	      System.out.println(obj1.);
	      
	}

}
