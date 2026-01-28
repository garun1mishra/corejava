/**
 * 
 */
package javaprograms;

/**
 * @author Garun Mishra
 *
 */
public class ReverseStringRecursive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// System.out.println("Welcome to reverse of string");
		String revString  = reverseStringRec("Garun Mishra");
		System.out.println(" Input  :    " + revString);

	}
	private static String reverseStringRec(String inputString) {
		if (inputString == null || (inputString.length() <= 0))
		return inputString;

		return reverseStringRec(inputString.substring(1)) + inputString.charAt(0);

		}

}
