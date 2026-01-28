/**
 * 
 */
package stringprogram.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author Garun Mishra
 *
 */
public class CountAnagraPairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String  : ");
		String str = sc.nextLine();
		Map<String, Integer> m = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				char[] chValue = str.substring(i, j + 1).toCharArray();
				Arrays.sort(chValue);
				String value = new String(chValue);
				if (m.containsKey(value))
					m.put(value, m.get(value) + 1);
				else
					m.put(value, 1);
			}

		}
		int countAnagramPair = 0;
		for (Entry<String, Integer> key : m.entrySet()) {
			int n = m.get(key.getKey());
			countAnagramPair += (n * (n-1)) / 2;
			System.out.println("["+key.getKey()+"]--- "+key.getValue());
		}
		System.out.println();
		System.out.println("Total anagrams pairs is : "+countAnagramPair);
	}

}
