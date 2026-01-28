/**
 * 
 */
package stringprogram;

/**
 * @author Garun Mishra
 *
 */
public class SortStringArrayAccordingToStingLength {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String []arr = {"GeeksforGeeks", "I", "from", "am"};
	    int n = arr.length;
	    // Sort the String Array
	    for(int i=1; i< arr.length ; i++) {
	    	String tempString  = arr[i];
	    	int j = i-1;
	    	while( j >= 0 && tempString.length() < arr[j].length() ) {
	    		arr[j+1] = arr[j];	    		
	    		j--;
	    	}
	    	arr[j+1] =tempString  ;	    
	    }
	    
	    //Display The String Array
	    
	    for (int i=0; i<n; i++)
	        System.out.print(arr[i]+" ");
	    

	}

}
