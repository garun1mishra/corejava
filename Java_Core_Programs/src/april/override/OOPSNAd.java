package april.override;

class Parent {
	String print() {
		System.out.println("Parent");
		return "800";
	}
}

class Child extends Parent {
	String print() {
		System.out.println("Child");
//		super.print();
		return "900";
	}
}


public class OOPSNAd {

	public static void main(String[] args) {
		Parent a1 = new Child();
		System.out.println(a1.print());
		Parent a2 = new Parent();
		System.out.println(a2.print());
		Child a3 = new Child();
		System.out.println(a3.print());		
//		Child a4 = (Child) new Parent();
		System.out.println(a3.print());		

	}

}
