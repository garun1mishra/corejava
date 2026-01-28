package april;

import java.util.ArrayList;
import java.util.List;

public class TestProgram {

	public static void main(String[] args) {
		int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int splitSize = 3;
	/* expected Output 
		[0, 1, 2]
		[3, 4, 5]
		[6, 7, 8]
		[9]
		*/
		 int j=0; // 1  
		    List<List<Integer>> listArray =  new ArrayList<>();   
		    List<Integer> subValue = new ArrayList<>();
		    for(int i =0; i < original.length ; i++ ){ 
		        if(j == splitSize){
		            listArray.add(subValue);
		            j = 0;
		            subValue = new ArrayList<>();
		        }
		        subValue.add(original[i]) ;
		        j++;
		    }
		System.out.println(listArray);
	}

}
