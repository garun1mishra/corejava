/**
 * 
 */
package hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Garun Mishra
 *
 */
public class TwoSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] num = {2,7,11,15};
		int target = 13;
		TwoSum tsum = new TwoSum();
		System.out.println(Arrays.toString(tsum.twoSum(num, target)));
		System.out.println(Arrays.toString(tsum.twoSumWithHashMap(num, target)));// avoid inner loop
	}

	private int[] twoSumWithHashMap(int[] num, int target) {

		Map<Integer, Integer> input = new HashMap<>();
		for(int i=0; i< num.length ; i++) {
			input.put(num[i], i);
		}
		
		for(int i=0; i< num.length ; i++) {
			int secondNumber = target - num[i];
//			if(input.containsKey(secondNumber)) {
				if(input.containsKey(secondNumber) && input.get(secondNumber) != i) {
				return new int[] { i, input.get(secondNumber)};
			}
		}
		
		throw new IllegalArgumentException("No Sum Found");
	}

	private int[] twoSum(int[] num, int target) {
		for(int i=0; i< num.length ; i++) {
			for(int j= i+1; j<num.length; j++) {
				if(num[i] + num [j] == target) {
					return new int[] { i, j};
				}
			}
		}
		throw new IllegalArgumentException("No Sum Found");
	}
}
