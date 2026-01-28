/**
 * 
 */
package stringprogram;

import java.util.Scanner;

/**
 * @author Garun Mishra
 *
 */
public class RoundNearestMultipleOfTen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number  : ");
		int num = sc.nextInt();
		int a = (num/10)*10;
		int b = a+10;
		int result = num-a > b-num ? b:a;		
		System.out.println("The Nearest round of multiple of 10 of  Result is "+(num-a > b-num ? b:a));

	}

}
