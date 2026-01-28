/**
 * 
 */
package program;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * @author Garun Mishra
 *
 */
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        long result = Result.maximumSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

	}

}
class Result {

    /*
     * Complete the 'maximumSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static long maximumSum(List<Integer> arr) {
   int nums[] = new int[arr.size()];
     for (int i = 0; i < arr.size(); i++){
          nums[i] = arr.get(i);
     }          
   
   
   int result = nums[0];
    int[] sum =  new int[nums.length];
    sum[0] = nums[0];
 
    for(int i=1; i<nums.length; i++){
        sum[i] = Math.max(nums[i], sum[i-1] + nums[i]);
        result = Math.max(result, sum[i]);
    }
 
    return result;
    
    
    }

}
