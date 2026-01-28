/**
 * 
 */
package test1;

/**
 * @author Garun Mishra
 *
 */

class Interval {
  int start;
  int end;

  public Interval(int start, int end) {
    this.start = start;
    this.end = end;
  }
};


public class MergeIntervals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[]  = {1,2,3,4,5,6,7,8,9,10};
		int searchItem  =  7; 
		int first = 0; 
		int last  = array.length - 1;		
		int middle = (first + last ) / 2;		
		
		while(first <= last) {
			if(array[middle] < searchItem) {
				first = middle +1; 
			}else if(array[middle] == searchItem) {
				System.out.println("the lement is found at  : "+middle);
				break;
			}else {
				last = middle -1;
			}
			middle = (first + last ) / 2;
			
		}

	}

//	
//
//	  public static List<Interval> merge(List<Interval> intervals) {
//	   
//		  Arrays.parallelSort(intervals, (s, e) -> s.start.compareTo(e.end));
//		  
//		  
//		  int temp =0;
//		  for(int i =0; i < intervals.size() -1;  i++ ) {
//			  Interval  iValue =  intervals.get(i);
//			  if(iValue.end >= iValue.start) {
//				  iValue.end = Math.max(iValue.end, iValue.start);
//				  iValue.start =  Math.min(iValue.start, iValue.start);
//			  }else {
//				  temp++;
//				  intervals.add(intervals.get(temp));				  
//			  }
//			  intervals.add();
//		  }
//		  return intervals; 
//	  }

	  
	  
}
