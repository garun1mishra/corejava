package april;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class SUmOfAddNumber {

	public static void main(String[] args) {
		int arr[] = new int[] {5,6,3,8,4,9,11,15,3};
		
		// Display SUm of odd and even numbers
		
		Map<Boolean, Integer> result = Arrays.stream(arr).boxed().collect(Collectors.partitioningBy( value -> value % 2 == 0, Collectors.summingInt(Integer:: intValue)));
		result.entrySet().forEach(rec -> {
			System.out.println(rec.getKey() + "   -------  " + rec.getValue());
		});
		
		//find maximun Odd number 
	int maxOdd = Arrays.stream(arr).boxed().filter(n -> n % 2 == 1).max(Integer::compare).orElse(0);
		System.out.println(maxOdd);
		
		//find minimum Odd number 
		int minEven = Arrays.stream(arr).boxed().filter(n -> n % 2 == 0).max(Integer::compare).orElse(0);
			System.out.println(minEven);
	}

}
