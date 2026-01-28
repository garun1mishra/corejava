package stream;

import java.util.Arrays;
import java.util.List;

public class IntegerSortStream {

	public static void main(String[] args) {
		List<Integer> listInteger = Arrays.asList(25,36,35,1,24,56,89,102,654,12);
		listInteger.stream().sorted().forEach(System.out::println);
		
		List<String> listStr = Arrays.asList("Garun", "Ajay", "Vijay", "Jyoti", "Shradha");
		listStr.stream().sorted().forEach(System.out::println);

	}

}
