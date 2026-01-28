package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

//class Interval
//{
//    int start,end;
//    Interval(int start, int end)
//    {
//        this.start=start;
//        this.end=end;
//    }
//}
//

public class MergeOverlappingIntervals {

	public static void main(String[] args) {
		 Interval arr[]=new Interval[4];
	        arr[0]=new Interval(6,8);
	        arr[1]=new Interval(1,9);
	        arr[2]=new Interval(2,4);
	        arr[3]=new Interval(4,7);
	        mergeIntervals(arr);

	}

	private static void mergeIntervals(Interval[] arr) {
		
		Stack<Interval> st = new Stack<Interval>();
		Arrays.sort(arr, new Comparator<Interval>(){
            public int compare(Interval i1,Interval i2)
            {
                return i1.start-i2.start;
            }
        });
		
		st.push(arr[0]);
		for(int i =0; i< arr.length; i++) {
			Interval top =  st.peek();
			
			if (top.end < arr[i].start) 
	            st.push(arr[i]); 
			
			 else if (top.end < arr[i].end) 
	            { 
	                top.end = arr[i].end; 
	                st.pop(); 
	                st.push(top); 
	            } 
		}
		
		  // Print contents of stack 
        System.out.print("The Merged Intervals are: ");
        while (!st.isEmpty()) 
        { 
            Interval t = st.pop(); 
            System.out.print("["+t.start+","+t.end+"] ");
        }  
		
		
		
		
		
	}

}
