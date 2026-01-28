/**
 * 
 */
package javaprograms;

/**
 * @author Garun Mishra
 *
 */
public class SearchElementExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 int number[] = {20,18,25,38,98,40,65,75,78,68};
	       int len = number.length;
	       int searchElement = 65;
	       System.out.println("Length  : "+len);
	        System.out.println("Before Sort  : ");
	        for(int i=0;i<len;i++){
	           System.out.println(number[i]);  
	        }        
	         System.out.println("Afetr Sort  : ");
	        // Arrays.sort(number); 
	      sortArray(number);
	         for(int i=0;i<len;i++){
	           System.out.println(number[i]);  
	        }
	         int halfLength = len/2;
	       int midValue = number[halfLength];
	       
	       if(midValue == searchElement ){
	           System.out.println("the element "+searchElement+" is at position  : "+halfLength);           
	       }  else{
	           if(midValue < searchElement ){
	               for(int i=0;i<halfLength -1;i++){
	                   if(number[i] ==  searchElement){
	                        System.out.println("the element "+searchElement+" is at position  : "+i); 
	                   }
	             
	        }
	           }
	           if(midValue > searchElement ){
	                   for(int i=halfLength+1;i>len;i++){
	                   if(number[i] ==  searchElement){
	                        System.out.println("the element "+searchElement+" is at position  : "+i); 
	                   }
	             
	        }
	           }
	       } 

	}

	private static int[] sortArray(int[] array) {
		 int temporary = 0;
	        for (int i = 0; i < array.length; i++) {
	            for (int j = i + 1; j < array.length; j++) {
	                if (array[i] > array[j]) {
	                    temporary = array[i];
	                    array[i] = array[j];
	                    array[j] = temporary;
	                }
	            }
	        }
		return array;
	}

}
