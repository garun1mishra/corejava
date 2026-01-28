package test1;

interface ChekcPalind {
	 void checkPolindrom(String str);
}
public class PalindromExample {

	public static void main(String[] args) {
		ChekcPalind p = (str) -> {				
			String temString ="" ;
			 int len =  str.length();
		     for( int i = len -1 ; i >= 0;  i-- ) {
		    	 temString = temString + str.charAt(i);
		     }
			 if(temString.equals(str)){
			   System.out.println("String "+str+" is Palindrom");
			 }else{
			  System.out.println("String  "+str+"  is not Palindrom");
			 }  
		   };
		  
		  String str =  "dalad";
		  p.checkPolindrom(str);
	}
}
