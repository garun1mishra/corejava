package com.test;

public class PalindromExample {

	public static void main(String[] args) {
		 
		PalindromExample example = new PalindromExample();
		ChekcPalind p = (str) -> {				
			String temString ="" ;
			 int len =  str.length();
		     for( int i = len -1 ; i >= 0;  i-- ) {
		    	 temString = temString + str.charAt(i);
		    	 
		     }
		     
			 if(temString.equals(str)){
				 example.clockWiseRotate(str);
			   System.out.println("String is Palindrom");
			 }else{
				 example.clockWiseRotate(str);
			  System.out.println("String is not Palindrom");
			 }  
			 
			 
		   };
		  
//		  String str = "nitin";
		  String str =  "garun";
		  p.checkPolindrom(str);
//		  p.checkPolindrom(str1);
		  

		 
	}

	private void clockWiseRotate(String str) {	
	
		if(str.length() <= 0) {
			System.out.println("inpout string is : "+str);
		}	
		 int i =3;     
	     System.out.println("Rotating string '" + str + "' left ")    ; 
	     while (i <=str.length()){      
	    	 str = str.substring(1) + str.charAt(0) ;
	      System.out.println(str);      
	      i++;      
	     }
			
			
		
	}

}
