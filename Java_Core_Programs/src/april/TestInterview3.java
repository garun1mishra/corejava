package april;

import java.util.Stack;

public class TestInterview3 {

	public static void main(String[] args) {
		String S1 = "geeksforgeeks";
        System.out.println(removeDuplicates(S1));
 
        String S2 = "aabcca";
        System.out.println(removeConsecutiveDuplicates(S2));

	}
	public static String removeConsecutiveDuplicates(String input)
    {
        if (input.length() <= 1)
            return input;
        if (input.charAt(0) == input.charAt(1))
            return removeConsecutiveDuplicates(
                input.substring(1));
        else
            return input.charAt(0)
                + removeConsecutiveDuplicates(
                       input.substring(1));
    }

	 public static String removeDuplicates(String s) {
	        Stack<Character> st = new Stack<>();
//	        st.push(s.charAt(0));
	        String ch  = "$";
	        for(int i = 0; i<s.length(); i++){
	            if(!st.isEmpty() && st.peek() == s.charAt(i)){
	                st.pop(); 	              
	                st.push(ch.charAt(0));
	            }else {
	            	 st.push(s.charAt(i));
	            }
	        }
	        StringBuilder sb = new StringBuilder();
	        while(!st.isEmpty()){
	            sb.append(st.pop());
	        }
	        String result =  String.valueOf(sb.reverse());
	        System.out.println(result);
	        return String.valueOf(sb.reverse());
	    }

	
	
}
