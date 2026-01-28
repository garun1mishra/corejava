/**
 * 
 */
package stringprogram;

/**
 * @author Garun Mishra
 * @Description
   Given a 26 letter character set, which is equivalent to character set of English alphabet i.e. (abcd….xyz) and act as a relation. We are also given several sentences and we have to translate them with the help of given new character set.

Examples: 

New character set : qwertyuiopasdfghjklzxcvbnm
Input : "utta"
Output : geek

Input : "egrt"
Output : code


Idea behind conversion of new character set is to use hashing. Perform hashing of new character set where element of set is index and its position will be new alphabet value. 

Approach1: 


Given New character set = "qwertyuiopasdfghjklzxcvbnm" 
First character is q, during hashing we will place 'a' (for position )
at index q i.e. (17th).
After hashing our new character set is "kxvmcnophqrszyijadlegwbuft".
For input "egrt" = 
      hash[e -'a'] = c 
      hash[g -'a'] = o 
      hash[r -'a'] = d 
      hash[t -'a'] = e
For "egrt" is equivalent to "code".
  
  
  
 *
 */
class Approach2{
static char[] alphabets  = "abcdefghijklmnopqrstuvwxyz".toCharArray();

public String conversion(String charSet, char[] charArray) {
	String result ="";
	for( char ch : charArray) {
		result += alphabets[charSet.indexOf(ch)];
	}
return result;	
	
}
	
	
	
}

public class ChangeStringToNewCharSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char charSet[] = "qwertyuiopasdfghjklzxcvbnm".toCharArray();
        String str = "egrt";
        int n = str.length();        
        // hashing for new character set
        char hashChar[] = new char[26];
        for (int i = 0; i < 26; i++) {
            int ch = Math.abs(charSet[i] - 'a');
            hashChar[ch] = (char) ('a' + i);
        }  
        // conversion of new character set
        String s="";
        for (int i = 0; i < n; i++) {
            s += hashChar[str.charAt(i) - 'a'];
        }
        System.out.println(s);
        
        System.out.println("Another Approach");
        String charSet1 = "qwertyuiopasdfghjklzxcvbnm";
        Approach2 ap2 = new Approach2();
        System.out.print(ap2.conversion(charSet1, str.toCharArray()));

	}

}
