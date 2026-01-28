package april.override;

class A {
	A(){
		System.out.println("A Constructor");
	}
	 void m1(A a){
	  System.out.println("m1 method in class A");	 
	 }
	}
	class B extends A {	
		B(){
			System.out.println("B Constructor");
		}
	 public void m1(A a){
	  System.out.println("m1 method in class B");
	 }
	}

public class OverringExample1 {

	
	
	public static void main(String[] args) {
		A a = new B();
		 a.m1(a);
		 a.m1(new B());
		 
	B b = new B();
	b.m1(null);
	a = b;
	a.m1(null);
	a.m1(new A());
	
	
	}

}
