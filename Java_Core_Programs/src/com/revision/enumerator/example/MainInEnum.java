/**
 * 
 */
package com.revision.enumerator.example;

/**
 * @author Garun Mishra
 *
 */
class Student{
	String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
}

public enum MainInEnum {

	RED, 
	GREEN, 
	BLUE;
	
	// enum constructor called separately for each
    // constant
    private MainInEnum()
    {
        System.out.println("Constructor called for : "
                           + this.toString());
    }
	
	public static void main(String ar[]) {
		MainInEnum menum = MainInEnum.BLUE;
		System.out.println(menum);
		
		menum.displayHello();
		displayStatic();
		
		Student st = new Student();
		st.setName("Garun");
		System.out.println(st.getName());
	}

	static void displayStatic() {
		System.out.println("Static method in enum example");
		
	}

	void displayHello() {
		System.out.println("Normal method in enum example");
		
	}
	
	
}
