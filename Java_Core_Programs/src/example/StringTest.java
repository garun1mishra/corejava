package example;

public class StringTest {

	public static void main(String[] args) {
		String a = new String("test").intern();
	    String b = new String("test1");

	    System.out.println(a.equals(b));
	    System.out.println(a == b);

	    System.out.println(Integer.toHexString(a.hashCode()));
	    System.out.println(Integer.toHexString(b.hashCode()));

	    String j = "this";
	    String k = new String("this1");
	    String l = "this";
	    

	    System.out.println(j.equals(l));
	    System.out.println(j == l);

	    System.out.println(Integer.toHexString(j.hashCode()));
	    System.out.println(Integer.toHexString(l.hashCode()));

//	    String aa  =  a.intern();
	    a.intern();
	    
	    System.out.println(Integer.toHexString(a.hashCode()));
	    
	}

}
