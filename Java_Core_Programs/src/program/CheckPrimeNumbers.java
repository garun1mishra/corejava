/**
 * 
 */
package program;

import java.util.Scanner;


/**
 * @author Garun Mishra
 * @Program java program to check whether a number can be expressed as sum of two prime numbers
 *  @Example N = 34 ==> 3+31, 5+29, 11+23, 17+17
 *
 */
public class CheckPrimeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the number => ");
	int num = sc.nextInt();
	boolean flag = false; 
	for(int i=2; i<= num / 2 ; i++) {
		
		 if(!checkPrimeNumber(i)) {
			 
			 if(!checkPrimeNumber(num - i)) {
				 System.out.println(num + " = " + i + " + " + (num - i));
				 flag = true;
			 }
		 }
	}
	
	if(!flag) {
		System.out.println(num + " can not be expressed as sum of two prime numbers");
	}
}

	private static boolean checkPrimeNumber(int num) {
		boolean isPrime= false; 
		for(int i=2; i<= num/2; i++) {
			if(num % i == 0) {
				isPrime = true; 
				break;
			}
		}
		
		return isPrime;
		
		
	}

}
