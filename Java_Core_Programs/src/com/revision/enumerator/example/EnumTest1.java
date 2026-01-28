package com.revision.enumerator.example;

/**
 * 
 * @author Garun Mishra
 * @Description Declearatio of enum 
 *   1. Outside of class 
 *   2. Inside of Class
 *   
 @Important_Points_of_enum:  

Every enum is internally implemented by using Class.
 internally above enum Color is converted to
class Color
{
     public static final Color RED = new Color();
     public static final Color BLUE = new Color();
     public static final Color GREEN = new Color();
}

Every enum constant represents an object of type enum.
enum type can be passed as an argument to switch statements.
    
    
 */
// Outside of class
enum Day1{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDDAY;
}

public class EnumTest1 {
	
	enum Direction {
		EAST, WEST, SOUTH, NORTH;
	}

	public static void main(String[] args) {
 System.out.println("Outside of class"+Day1.FRIDAY);	
 
 System.out.println("Inside of class"+Direction.EAST);	
	}

}
