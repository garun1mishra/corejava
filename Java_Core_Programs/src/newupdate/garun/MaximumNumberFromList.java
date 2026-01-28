package newupdate.garun;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaximumNumberFromList {
    public static void main(String a[]){
        //How do you get the highest number that exists on a list?
//  Method 1:      Using Collections.max
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7,  7, 3, 5);
        System.out.println("Lowest number in List : " + Collections.max(numbers));
  //Method 2: Using stream
        System.out.println("Lowest number in List : " + numbers.stream().max(Comparator.naturalOrder()).get());
        //Method 3: Using stream (reference variable)
        System.out.println("Lowest number in List : " + numbers.stream().max(Integer::compare).get());

        //Method 4: Using stream (reduce)
        System.out.println("Lowest number in List : " + numbers.stream().reduce(Integer.MIN_VALUE, Integer :: max));

    }
}
