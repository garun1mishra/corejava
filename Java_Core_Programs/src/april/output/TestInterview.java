/**
 * 
 */
package april.output;

import java.util.Arrays;

/**
 * @author Garun Mishra
 *
 */
public class TestInterview {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String text = "forfxorfxdofr";
		String pattern = "for";

		int len = text.length();
		int plen = pattern.length();
		int count = 0;

		for (int i = 0; i < len - plen; i++) {
			String subString = text.substring(i, plen - 1);
			char[] subChar = subString.toCharArray();
			char[] patternChar = pattern.toCharArray();
			Arrays.sort(patternChar);
			Arrays.sort(subChar);
			plen++;
			if (subChar == patternChar)
				count++;
			
			
		}
		
		System.out.println("Total Count is  : "+count);

	}

}
