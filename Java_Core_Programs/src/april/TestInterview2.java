package april;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author Garun Mishra
 
 Write a Comparator in Java to compare two employees based upon there name, departments, and age?
 
 */

//class Employee implements Comparable<T>{
//	public String name;
//	public String dept; 
//	public int age;
//	
//	
//	public Employee(String name, String dept, int age) {
//		super();
//		this.name = name;
//		this.dept = dept;
//		this.age = age;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getDept() {
//		return dept;
//	}
//	public void setDept(String dept) {
//		this.dept = dept;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	@Override
//	public int compareTo(T o) {
//		
//	}
//	@Override
//	public int compareTo(T o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	
//	
//	
//	
//}


public class TestInterview2 {

	public static void main(String[] args) {
	
		/*
		 * List<Employee> elist = new ArrayList<>(); Employee e1 = new Employee("garun",
		 * "IT", 34); Employee e2 = new Employee("abdul", "IT2", 35); elist.add(e1);
		 * elist.add(e2);
		 */
	
	boolean check = true;
	String str = "absbdfjg";
	Map<Character, Integer> map = new HashMap<>();
	char ch [] = str.toCharArray();
	
	for(int i =0; i< ch.length -1 ; i++) {
		if(map.containsKey(ch[i])) {
			int count  =  map.getOrDefault(ch, 0);
			map.put(ch[i],count + 1);	
			check = false;
			break;
		}else {
			
			map.put(ch[i],1);
		}}
	
	
	if(!check) {
		System.out.println("String is not unique");
	}else {
		System.out.println("String is unique");
	}
	
	
	/*
	
	 Write a java program to print the desired output
    * 
   * * 
  * * * 
 * * * * 
* * * * *



	 
	 * 
	 */
	
//int num  = 5;
//for(int i =0; i < num ; i++ ) {
//	for(int k =0;k < num / 2; k++) {
//		for(int l =0 ; l <  ) {
//			
//		}
//		
//		
//		
//		}
//	
	
	
}

}
