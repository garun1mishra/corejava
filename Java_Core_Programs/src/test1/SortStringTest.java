/**
 * 
 */
package test1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Garun Mishra
 *
 */
public class SortStringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> name =  Arrays.asList("Garun", "Saurabh", "Garun", "Saurabh", "Vijay");
		name.stream().map(value->value).collect(Collectors.groupingBy(Object:: toString , Collectors.counting())).
		entrySet().forEach(rec ->{
			if(rec.getValue() > 1) {
				System.out.println("Name "+rec.getKey() + " ------  "+rec.getValue());
			}
			
		});
//		printNumOfOccurance(name);	

	}



	private static void printNumOfOccurance(List<String> name) {
		Map<String, Integer> map = new HashMap<>();
		int listSize = name.size(); //
		for (int i = 0; i < listSize; i++) { // O(n) + 1
			if (map.containsKey(name.get(i))) {
				map.put(name.get(i), map.get(name.get(i)) + 1);
				System.out.println(name.get(i) + " -- " + map.get(name.get(i)));
			} else {
				map.put(name.get(i), 1);
				System.out.println(name.get(i) + " -- " + map.get(name.get(i)));
			}
		}
	}

}
