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
public class HighestAndLowestNumberFromArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int data[] = new int[] { 30, 8, 2, 350, 4, 63, 98 };
		int smallest = data[0];
		int large = data[0];
		int k=2;
		int j =0;
		int data1[] = new int[data.length - k]; 
		for (int i = 2; i < data.length; i++) {
			if (data[i] > large) {
				large = data[i];
				data1[j] = data[i];
				j++;
			} else if (data[i] > large) {
				smallest = data[i];
				data1[j] = data[i];
				j++;
			}

		}
System.out.println(" Smaller : "+smallest);		
System.out.println(" Larger : "+Arrays.toString(data1));	

	}

}
