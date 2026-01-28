package stringprogram.java8;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class SortArrayAccordingToDifference {
	
	// Driver code
    public static void main(String args[])
    {
        int[] arr = { 10, 5, 3, 9, 2 };
        int n = arr.length;
        int x = 7;
 
        // Function call
        rearrange(arr, n, x);
        printArray(arr, n);
    }
    
    
 private static void rearrange(int[] arr, int n, int x) {

	 TreeMap<Integer, ArrayList<Integer>> tm = new TreeMap<>();
	 for(int i =0; i< n-1; i++) {
		 
		 int diff =  Math.abs(x-arr[i]);
		 if(tm.containsKey(diff)) {
			 ArrayList<Integer> al = tm.get(diff);
			 al.add(arr[i]);
			 tm.put(diff, al);
		 }else {
			 ArrayList<Integer> al = new ArrayList<>();
			 al.add(arr[i]);
			 tm.put(diff, al);
		 }
		 
	 }
	 // Update the values of array
     int index = 0;
     for (Map.Entry entry : tm.entrySet()) {
         ArrayList<Integer> al = tm.get(entry.getKey());
         for (int i = 0; i < al.size(); i++)
             arr[index++] = al.get(i);
     }	 
	 
	}


// Function to print the array
    static void printArray(int[] arr, int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    
    
	

}
