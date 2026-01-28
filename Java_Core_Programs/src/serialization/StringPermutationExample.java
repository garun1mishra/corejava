/**
 * 
 */
package serialization;

import java.util.Scanner;

/**
 * @author Garun Mishra
 *
 */
public class StringPermutationExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for permutaion : ");
		String val = sc.next();
		permutationExample("", val);

	}

	private static void permutationExample(String perm, String val) {
		if(val.isEmpty()) {
			System.err.println(perm+val);
		}else {
			for(int i=0; i< val.length() ; i++) {
				permutationExample(perm+val.charAt(i), val.substring(0, i)+val.substring(i+1, val.length()));
			}
		}
		
	}

}
