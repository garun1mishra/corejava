package com.revision;

public class InstanceVariableTest {

	int var = 10;
	static String name = "garun";
	static String name2;
	
	public void display() {
		System.out.println("Hii..  INstance Method..!!");
	}
	
	public static void displayStatic1() {
		System.out.println("Hii..  INstance Method..!!");
	}
	
	
	public static void main(String[] args) {
		InstanceVariableTest st = new InstanceVariableTest();
		st.display();
		System.out.println("Insdtace Value  : "+st.var);
		System.out.println(st.name);
		System.out.println(st.name2);
		st.displayStatic1();
		
		
		for(int i=0;i<5;) { // 
		 System.out.println("Garun Mishra"); // this will display infinite time.
		}
	}

}
