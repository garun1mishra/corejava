/**
 * 
 */
package test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Garun Mishra
 *
 */
public class AddList {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(1, 1);
		List<Integer> b = Arrays.asList(1, 1, 1);
		addList2(a, b);

	}

	private static void addList2(List<Integer> a, List<Integer> b) {
		List<Integer> result = new ArrayList<>();
	 String value1 =  "";
	 String value2 =  "";
	 
	 for(int i=0; i < a.size(); i++) value1 += ""+a.get(i);  
	 
	 for(int i=0; i < b.size(); i++) value2 += ""+b.get(i);  
	
	 int value = Integer.parseInt(value1) + Integer.parseInt(value2);
	 String resValue =  String.valueOf(value);
	 for(int i =0; i< resValue.length() ; i++) {
		 String v= ""+resValue.charAt(i);
		 result.add(Integer.parseInt(v));
		 
	 }
	 System.out.println(result);
	}	
}
