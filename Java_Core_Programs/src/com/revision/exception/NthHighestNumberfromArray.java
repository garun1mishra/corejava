/**
 * 
 */
package com.revision.exception;

/**
 * @author Garun Mishra
 *
 */
public class NthHighestNumberfromArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int data[] = new int[] { 30, 8, 2, 350, 4, 63, 98 };
	    int n = data.length;
//	    int first = Integer.MIN_VALUE;    
//	    int second = Integer.MIN_VALUE;
	    int first = data[0];    
	    int second = data[0];
		    for(int i=1; i< data.length ; i++) {
	    	if(data[i] > first) {
	    		second = first; 
	    		first = data[i];
	    	}else if(data[i] > second && data[i] != first) {
	    		second =data[i];
	    	}
	    	    	
	    }
	    
	    if (second == Integer.MIN_VALUE)
            System.out.print("There is no second largest"
                             + " element\n");
        else
            System.out.print("The second largest element"
                             + " is " + second);
	  
	}

}
