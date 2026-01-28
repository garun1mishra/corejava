/**
 * 
 */
package april;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Garun Mishra
 *
 */
public class TestInt1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> el = Arrays.asList("a,b", "c,d", "b,a", "e,c,d");  
		el = el.stream().sorted().collect(Collectors.toList());
//			Collections.sort(el);
		System.out.println(el);
		int[] start_time = new int[] {7, 10, 2,0,4};
		int[] end_time = new int[] {11,12,5,6,5};
		
	
       int countMeeting =0;
	
       for(int i=0; i< end_time.length -1; i++) {
    	   
    	   if(end_time[i] - start_time[i] > 0) {
    		   countMeeting++;
    	   }
    	   if( end_time[i] != 12 && end_time[i] != 0) {
    		   
    	   } else if(end_time[i] - start_time[i + 1] > 0){
    		   countMeeting--;
    	   }
       }
	System.out.println(countMeeting);	

	}

}
