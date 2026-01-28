/**
 * 
 */
package april.output;

import java.util.Arrays;

/**
 * @author Garun Mishra
 *
 */
public class CountAnagrams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String text = "forxxorfxdofr";
        String word = "for";
        int tlen = text.length();
        int wlen = word.length();
     // Initialize result
        int count = 0;
        for(int i=0; i<= tlen - wlen ; i++) {
        	
        	String subString = text.substring(i, i+wlen);
        	char[] subChar = subString.toCharArray();
			char[] patternChar = word.toCharArray();
			Arrays.sort(patternChar);
			Arrays.sort(subChar);
			
			if(Arrays.equals(subChar, patternChar))  count++;
        	
        }
        
      System.out.println("The Output is  : "+count);  
        
        
	}

}
