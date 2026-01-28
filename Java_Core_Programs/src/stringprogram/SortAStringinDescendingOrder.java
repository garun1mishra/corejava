/**
 * 
 */
package stringprogram;

import java.util.Scanner;

/**
 * @author Garun Mishra
 *
 */
public class SortAStringinDescendingOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		char[] input = sc.nextLine().toCharArray();
		char tempChar;
		System.out.println("Before Sort  "+ String.valueOf(input));
		for(int i=0; i< input.length ; i++) {
			for(int j=i+1; j< input.length ; j++) {
				if(input[j] > input[i]) {
					tempChar = input[i];
					input[i] = input[j];
					input[j] = tempChar;
				}
			}
		}
		System.out.println("After Sort  "+ String.valueOf(input));

	}

}
