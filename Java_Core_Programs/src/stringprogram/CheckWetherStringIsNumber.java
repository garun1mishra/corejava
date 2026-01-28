package stringprogram;

import java.util.Scanner;

public class CheckWetherStringIsNumber {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String s= sc.nextLine();
	boolean checkNumber = true;
	for(int i=0; i< s.length(); i++) {
		if(Character.isDigit(s.charAt(i)) ==  false) {
			checkNumber = false;
		}
	}
	
	if(!checkNumber) {
		System.out.println("String is not Number");
			} else {
				System.out.println("String is Number");
			}
	
	
	}

}
