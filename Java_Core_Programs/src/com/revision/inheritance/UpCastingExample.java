package com.revision.inheritance;

class A{
	public void display() {
		System.out.println("Inside A");
	}
}

class B extends A{
	public void display() {
		super.display();
		System.out.println("Inside B");
	}
}

public class UpCastingExample extends B{

	public static void main(String[] args) {
 System.out.println("Hello");
		A a = new B();
		
//		B b = (B) new A(); // Error: type mismatch, can not convert from A to B. casting required
		B b = (B) a;
		a.display();
		b.display();
	
	}

}
