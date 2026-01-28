package april;

class A{
public A(){
System.out.print("A");
}
}
class B extends A{
public B(){
System.out.print("B");
}
}
class C extends B{
public C(){
System.out.print("C");
}
}

public class Demo {
	
	public static void main(String[] args) {
//		C c=new C();
//		B b = new B();
//		A a = new A();
		A c=new C();
		
	}

}
