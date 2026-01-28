/**
 * 
 */
package program;

import java.util.Scanner;

/**
 * @author Garun Mishra
 *
 */
public class SumOfNaturalNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number = > ");
		int num  = sc.nextInt();
		int sum =0;
		// using loop
		for(int i=0; i<= num ; i++) {
			sum+= i;
		}
		System.out.println("The sum with normal loop : "+sum);
		
		//using recrursion
		int sumrec = addNum(num);
		
		System.out.println("The sum with recursion : "+sumrec);
		
	}
	
	private static int addNum(int num) {
		if(num != 0) {
			return num + addNum(num - 1);
		}else {
			return num;
		}
		
		
		
	}

}
