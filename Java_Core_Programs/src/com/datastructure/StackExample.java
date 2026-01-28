/**
 * 
 */
package com.datastructure;

import java.util.Stack;

/**
 * @author Garun Mishra
 *
 */
public class StackExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 2894;  // OP - 4982
			Stack<Integer> s = new Stack<>();
			
			
			while(num > 0) {
//				int rem = num%10;
				s.push(num%10);
				num = num/10;
			}
			int result =0;
			int it =1;
			while(!s.isEmpty()) {
				int val = s.pop();
				result = result + val * it;
				it *= 10;
				
			}
			
			System.out.println("Reverse Output is : "+result);
			
			
			
			
	}

}
