package com.revision.inheritance;

public class NullObjectStringTest {

	public void display(Object value) {
		System.out.println("This is Object  : "+value);
	}
	public void display(String value) {
//		display(null);
		System.out.println("This is String  : "+value);
	}
	
	public static void main(String[] args) {
	
		NullObjectStringTest ob = new NullObjectStringTest();
		ob.display(null);
		
	}

}
