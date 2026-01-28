package test1;

import java.util.Arrays;

public class AnagramExample {

	public static void main(String[] args) {
		String str1 = "garun";
//		String str2 =  "runga";
//		
//		if(str1.length() != str2.length()) System.out.println("inputs are not anagram");
//		
//		char[] srachar1 = str1.toCharArray();
//		char[] srachar2 = str2.toCharArray();
//		
//	
//		for(int i =0; i < srachar1.length - 1 ; i++) {
//			for(int j=i; j <  srachar1.length - 1 ; j++){
//				if(srachar1[i] > srachar1[j]) {
//					
//				}
//				
//			}
//		}
		
//		int i =0; 
//		
//	while( i < str1.length()) {
//		
//		str1 = str1.charAt(0) + str1.substring(0, 1);
//		 System.out.println(str1);
//		
//		i++;
//	}
//		
	String revS = reverse(str1);	
	System.out.println(revS);
		
		
		
		
//		Arrays.sort(srachar1);
//		Arrays.sort(srachar2);
		
		
		
		
//		System.out.println();
		
		

	}

	private static String reverse(String str1) {
	  if(str1.isEmpty()) {
		return str1;
	  }	     
	return reverse(str1.substring(1)) + str1.charAt(0);
	}
}
