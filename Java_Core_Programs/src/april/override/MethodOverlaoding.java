package april.override;

import april.Demo;

public class MethodOverlaoding {

//	String m1(String x){
//		 System.out.println("One");
//		 return "ABC";
//		}
		String m1(String y){
		 System.out.println("Two");	
		 return "PQR";
		}
	
	public static void main(String[] args) {
		MethodOverlaoding a = new MethodOverlaoding();
		a.m1(null); 

	}

}
