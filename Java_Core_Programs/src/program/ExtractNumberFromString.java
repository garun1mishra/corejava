/**
 * 
 */
package program;

import java.util.Scanner;

/**
 * @author Garun Mishra
 *
 */
public class ExtractNumberFromString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.println("Please enter the sentence : \n ");
		String str1 = sc.nextLine();		

		// extract digits only from strings
		String numberOnly = str1.replaceAll("[^0-9]", "");
		// extract character only from strings
		String charOnly = str1.replaceAll("[0-9]", "");
		System.out.println(numberOnly);		
		System.out.println(charOnly);
	}

}
