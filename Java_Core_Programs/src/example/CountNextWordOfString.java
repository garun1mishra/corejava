/**
 * 
 */
package example;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Garun Mishra
 *
 */
public class CountNextWordOfString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "Siddhesh is a smart guy the city he lives in is a smart city";
	    ArrayList<String> lis = new ArrayList<String>();
	    lis.add("is");
	    lis.add("a");
	    lis.add("smart");
	    //OP - [guy, city]
	    String [] sArray = s.split(" ");
	    ArrayList<String> temp_lis = new ArrayList<String>(Arrays.asList(sArray));	    
	    ArrayList<String> res = new ArrayList<String>();
	    int N = lis.size();
	 
	    // Loop to find the matching string
	    // and the last word
	    String join_lis = "";
	    for (int str = 0; str < lis.size(); str++)
	      join_lis += lis.get(str);	
	    
	    for (int i = 0; i < temp_lis.size() - N; ++i) {
	      String join_temp_lis = new String();
	      
	      for (int j = i; j < i + N; ++j) join_temp_lis += temp_lis.get(j);
	      
	      if (join_lis.equals(join_temp_lis))
	        res.add(temp_lis.get(i + N));
	    }
	    
	 System.out.println(res);   
	    
	    

	}

}
