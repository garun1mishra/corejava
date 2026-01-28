/**
 * 
 */
package com.stacks;

import java.util.Stack;

/**
 * @author Garun Mishra
 *
 */
public class FindNearestGraeterElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
   long [] arr =  {6, 8, 0, 1, 3};		
   int n = arr.length;
   long ans[] = nextLargerElement( arr,n);
  for(int i=0; i < ans.length -1 ; i++) {
	  System.out.print(i+"   ");
  }
	}

	
	 public static long[] nextLargerElement(long[] arr, int n)
	    { 
	        Stack<Long> s = new Stack<Long>();
	        
	        long[] ans = new long[n];
	        
	        for(int i=n-1; i>=0; i--)
	        {
	           while((!s.isEmpty()) && (s.peek() <= arr[i])) {
	               s.pop();
	           }	           
	           ans[i] = (s.isEmpty() ? -1 : s.peek());
	           s.push(arr[i]);
	        }
	        return ans;
	    } 
}
