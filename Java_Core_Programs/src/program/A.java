package program;

class C{
	void display() {
		System.out.println("Hello Super");
	}
}
 
class B extends C{
	void display() {
		System.out.println("Hello Super");
	}
}

public class A extends B {

	public static void main(String[] args) {
	  B a = new A();
	  
	  int [][] b = new int[8][3];
  System.out.println(b.length);
  System.out.println(b[0].length);
	}

}
