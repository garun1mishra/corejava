package stringprogram.java8;

import java.util.HashMap;

/**
 * 
 * @author Garun Mishra
 * @Program Longest subarray having count of 1s one more than count of 0s
 * 
 @Description: Given an array of size n containing 0’s and 1’s only. The problem is to find the length of the longest subarray having count of 1’s one more than count of 0’s. 

Examples: 

Input : arr = {0, 1, 1, 0, 0, 1}
Output : 5
From index 1 to 5.

Input : arr[] = {1, 0, 0, 1, 0}
Output : 1

@Approach
Consider all the 0’s in the array as ‘-1’.
Initialize sum = 0 and maxLen = 0.
Create a hash table having (sum, index) tuples.
For i = 0 to n-1, perform the following steps:
If arr[i] is ‘0’ accumulate ‘-1’ to sum else accumulate ‘1’ to sum.
If sum == 1, update maxLen = i+1.
Else check whether sum is present in the hash table or not. If not present, then add it to the hash table as (sum, i) pair.
Check if (sum-1) is present in the hash table or not. if present, then obtain index of (sum-1) from the hash table as index. Now check if maxLen is less than (i-index), then update maxLen = (i-index).
Return maxLen.
 */

public class LongestSubArrayHavingCountOfOne {
	
	// function to find the length of longest
    // subarray having count of 1's one more
    // than count of 0's
    static int lenOfLongSubarr(int arr[], int n)
    {
        // unordered_map 'um' implemented as
        // hash table
        HashMap<Integer, Integer> um
            = new HashMap<Integer, Integer>();
        int sum = 0, maxLen = 0;
 
        // traverse the given array
        for (int i = 0; i < n; i++) {
 
            // consider '0' as '-1'
            sum += arr[i] == 0 ? -1 : 1;
 
            // when subarray starts from index '0'
            if (sum == 1)
                maxLen = i + 1;
 
            // make an entry for 'sum' if it is
            // not present in 'um'
            else if (!um.containsKey(sum))
                um.put(sum, i);
 
            // check if 'sum-1' is present in 'um'
            // or not
            if (um.containsKey(sum - 1)) {
 
                // update maxLength
                if (maxLen < (i - um.get(sum - 1)))
                    maxLen = i - um.get(sum - 1);
            }
        }
 
        // required maximum length
        return maxLen;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        int arr[] = { 0, 1, 1, 0, 0, 1 };
        int n = arr.length;
        System.out.println("Length = "
                           + lenOfLongSubarr(arr, n));
    }
	
	

}
