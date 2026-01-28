/**
 * 
 */
package com.test;

/**
 * @author Garun Mishra
 *
 */
public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		   int array[] = {10, 20, 25, 63, 96, 57};
		   int l =  4;
		   solution(array, l);
	}

	public static int solution(int[] array, int k ) {
		int count =0;
		for(int i=0; i < array.length; i= i+count) {			
			for(int j= 0 ; j < k; j++) {
				System.out.print(array[j]+ "  ");
				count++;
				
			}
			System.out.println();
		}
		
		return k;

    }
}
