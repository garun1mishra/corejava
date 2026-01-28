package april.output;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//create a list
class Student {

 // id will act as Key
 private Integer id;

 // name will act as value
 private String name;

 // create curstuctor for reference
 public Student(Integer id, String name)
 {

     // assign the value of id and name
     this.id = id;
     this.name = name;
 }

 // return private variable id
 public Integer getId()
 {
     return id;
 }

 // return private variable name
 public String getName()
 {
     return name;
 }
}

public class ConvertListToMap {

	public static void main(String[] args) {
		// create a list
        List<Student> lt = new ArrayList<>();
  
        // add the member of list
        lt.add(new Student(1, "Geeks"));
        lt.add(new Student(2, "For"));
        lt.add(new Student(3, "Geeks"));
  
        // create map with the help of
        // Collectors.toMap() method
        
        LinkedHashMap<Integer, String> map = lt.stream().collect(Collectors.
        		 toMap(Student:: getId, Student:: getName, (x, y) -> x+ " , "+y, LinkedHashMap::new));
        
        map.forEach((x,y) -> System.out.println(x+ " ---  "+y));
        
//        2nd Approach
        System.out.println();
        System.out.println("Using grouping By  : ");
        System.out.println();
        Map<Integer, List<String>> m = lt.stream().collect(Collectors.groupingBy(Student::getId, Collectors.mapping(Student::getName, Collectors.toList())));

        System.out.println("MultiMap = " + m);
        
	}

}
