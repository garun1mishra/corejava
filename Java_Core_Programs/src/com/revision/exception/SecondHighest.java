/**
 * 
 */
package com.revision.exception;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Garun Mishra
 *
 */
public class SecondHighest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int data[] = new int[] { 30, 8, 2, 350, 4, 63, 98 };
		Scanner sc = new Scanner(System.in);
		System.out.println("The array is : " + Arrays.toString(data));
		System.out.println("Enter the nth number : ");
		int k = sc.nextInt();
		int len = data.length;
		int temp;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (data[i] > data[j]) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}

		System.out.println("The " + k + "th highest number is  : " + data[len - k]);

	}
}
