package april.override;

class E {
	void m1(Object obj) {
		System.out.println("One");
	}
}

class F extends E {
	void m1(Object obj) {
		super.m1(null);
		System.out.println("Two");
	}

	void m2(Object obj) {
		System.out.println("Three");
		this.m1(null);
	}
}

public class OverridingExample3 {

	public static void main(String[] args) {
		/*
		E e = new F();
//		e.m1(new E()); // String is not comaptible with E()
		e.m1(null);
		
		*/
		E e = new F();
		e.m1(new E()); // One, Two
		
		F f =  new F();
		f.m2(new F());
		
		
	}

}
