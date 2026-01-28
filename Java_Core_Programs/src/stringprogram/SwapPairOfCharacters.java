/**
 * 
 */
package stringprogram;

/**
 * @author Garun Mishra
 * @Description Swapping Pairs of Characters in a String in Java
 * @Example
 * 
 The given string contains even number of characters. Therefore, we swap every pair of characters.

Input: str = “GeeksForGeeks”

Output: eGkeFsroeGkes

Explanation: The given string contains odd number of characters. Therefore, we swap every pair of characters and last character remains as it is.
  
  
  
 * 
 *
 */
public class SwapPairOfCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char[] str = "GeeksForGeeks".toCharArray();
		System.out.println("Input  :  "+String.valueOf(str));
		for(int i=0; i< str.length - 1; i+=2) {
			char temp = str[i];
			str[i] = str[i+1];
			str[i+1] = temp;
		}
		System.out.println("Input  :  "+String.valueOf(str));
	}

}
