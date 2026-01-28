package april.override;

class C {

	void m1(String x) {
		System.out.println("One");
	}
}

class D extends C {
	public void m1(String x) {
		System.out.println("Two");
		super.m1(null);
	}
}

public class OverringExample2 {

	public static void main(String[] args) {
		C c = new D();
		c.m1(null);

	}

}
