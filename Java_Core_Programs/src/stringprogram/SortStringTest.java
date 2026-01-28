package stringprogram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortStringTest {


    /**
     * @param args
     */
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Garun", "Saurabh", "Garun", "Saurabh", "Vijay", "Garun", "Saurabh", "Garun", "Saurabh", "Vijay", "Sanjay");
       name.stream().map(value -> value).collect(Collectors.groupingBy(Object:: toString, Collectors.counting())).entrySet().
       forEach(record -> {
    	   if(record.getKey().startsWith("S")) {
    		   System.out.println(record.getKey() + " ----- " +record.getValue());
    	   }
    	   System.out.println(record.getKey() + " ----- " +record.getValue());
       });
        
        // printNumOfOccurance(name);
    }

    private static void printNumOfOccurance(List<String> name) {
        Map<String, Integer> map = new HashMap<>();
        int listSize = name.size(); //
        for (int i = 0; i < listSize; i++) { // O(n) + 1
            if (map.containsKey(name.get(i)))
                map.put(name.get(i), map.get(name.get(i)) + 1);
            else
                map.put(name.get(i), 1);
        }
        map.entrySet().forEach(rec -> {
            System.out.println(rec.getKey() + " -- " + rec.getValue());
        });
    }
}
