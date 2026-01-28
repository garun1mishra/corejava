package stringprogram.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateInString {
    public static void main(String a[]){
//        String str = "Hello Hello";
        String str = "Abcccnnnwwwzxv";
         str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Object::toString, Collectors.counting()))
                 .entrySet().forEach(rev-> {
                	 if(rev.getValue() > 1) {
                		 System.out.println(rev.getKey()+" -- "+rev.getValue()); 
                	 }
                     
                 });

			
			 List<String> list = Arrays.asList("Hello", "Hello", "Garun", "Mishra", "Garun", "Mishra", "Hello");
			  list.stream().map(word->word).collect(Collectors.groupingBy(Object ::
			  toString, Collectors.counting())) .entrySet().forEach(rev-> {
			  System.out.println(rev.getKey()+" -- "+rev.getValue()); });
			  
			  int count  = list.stream().map(word->word).collect(Collectors.toList()).size();
			System.out.println(count);
        
    }
    
    

}
