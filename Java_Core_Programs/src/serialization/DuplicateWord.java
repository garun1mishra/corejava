/**
 * 
 */
package serialization;

import java.util.HashMap;
import java.util.Set;

/**
 * @author Garun Mishra
 *
 */
public class DuplicateWord {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String words = "I am a java programmer and IT server programmer with java a best java lover";		
		duplicate(words);
	}

	private static void duplicate(String words) {
	HashMap<String, Integer> wCount = new HashMap<String, Integer>();
	String word[] = words.split(" ");
	System.out.println("Total word : "+word.length);
	int val=0;
	for(String eachWord : word) {
		if(wCount.containsKey(eachWord)) {
			wCount.put(eachWord, wCount.get(eachWord)+1);
			if(val < wCount.get(eachWord)) {
				val =  wCount.get(eachWord);
			}
			System.out.println(eachWord + " : "+wCount.get(eachWord));
		}else {
			wCount.put(eachWord, 1);
		}
		
	}
	
	System.out.println("Maximum : "+val);
	
	//Extracting all keys of word count
//	Set<String> wordsInString = wCount.keySet();
//	for(String word1 : wordsInString) {
//		if(wCount.get(word1) > 1) {
//			System.out.println(word1 + " : "+wCount.get(word1));
//		}else {
//			System.out.println(word1 + " : "+wCount.get(word1));
//		}
//    	}
	}

}
