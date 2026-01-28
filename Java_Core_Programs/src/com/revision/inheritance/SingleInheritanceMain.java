 package com.revision.inheritance;

class one {
    public void print_geek()
    {
        System.out.println("Geeks");
    }
}
  
class two extends one {
    public void print_for() { System.out.println("for"); }
}

public class SingleInheritanceMain {

	public static void main(String[] args) {
		two t = new two();
		t.print_geek();
		
	}

}
