/**
 * 
 */
package com.revision.exception;

import java.util.Arrays;

/**
 * @author Garun Mishra
 *
 */
public class ReArrangeArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n, ar[] = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
		n = ar.length;

		int i, j, temp;

// Iterate over the array
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {

				// Check is any ar[j]
				// exists such that
				// ar[j] is equal to i
				if (ar[j] == i) {
					temp = ar[j];
					ar[j] = ar[i];
					ar[i] = temp;
					break;
				}
			}
		}

System.out.println("Arrays   :  "+Arrays.toString(ar));
		for (i = 0; i < n; i++) {
			// If not present
			if (ar[i] != i) {
				ar[i] = -1;
			}
		}

// Print the output
		System.out.println("Array after Rearranging");
		for (i = 0; i < n; i++) {
			System.out.print(ar[i] + " ");
		}

	}

}
