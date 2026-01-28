package program.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromListMain {

	public static void main(String[] args) {
		Integer[] arr=new Integer[]{1,2,3,4,3,2,4,2};
        List<Integer> listWithDuplicates = Arrays.asList(arr);
        System.out.println("Original list  =>  \n");
        listWithDuplicates.stream().forEach(System.out::print);
        System.out.println("\n Find duplicate using Set and toSet method of Collector =>  \n");
        Set<Integer> setWithoutDups = listWithDuplicates.stream().collect(Collectors.toSet());
        setWithoutDups.forEach((i)->System.out.print(" "+i));
        System.out.println("\n Find duplicate using distict pipelined method =>  \n");
        List<Integer> listWithoutDups = listWithDuplicates.stream().distinct().collect(Collectors.toList());
        listWithoutDups.forEach((i)->System.out.print(" "+i));

	}

}
