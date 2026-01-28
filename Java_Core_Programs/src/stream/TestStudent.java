/**
 * 
 */
package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Garun Mishra
 *
 */
public class TestStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please ennter the number of student you want to enter");	
		int num =sc.nextInt();
		List<Student> studentList = new ArrayList<Student>();
		for(int i=0; i< num ; i++) {
			System.out.println("Please enter the "+i  +" student details in name, rNo, age, and marks formate ");
			String name= sc.next();
			int rNo = sc.nextInt();
			int marks = sc.nextInt();
			int age = sc.nextInt();
			studentList.add(new Student( name,  rNo,  age,  marks));		
			
		}	
		studentList.stream().forEach(s-> System.out.println(s));
		// print the records who has more than 80 marks
		studentList.stream().filter(e-> e.getMarks() > 80).forEach(s-> System.out.println(s.getName() + ", Roll No  : "+s.getRollNo()));
		// The name who got maximum marks		
		int highestMark = studentList.stream().map(e-> e.getMarks()).max(Integer :: compare).get();
		System.out.println(highestMark);
		studentList.stream().filter(e-> e.getMarks() > highestMark).forEach(s-> System.out.println(s.getName() + ", Roll No  : "+s.getRollNo()));
		// the name who got minimum marks
		int lowestMark = studentList.stream().map(e-> e.getMarks()).min(Integer :: compare).get();
		System.out.println(lowestMark);
		studentList.stream().filter(e-> e.getMarks() > lowestMark).forEach(s-> System.out.println(s.getName() + ", Roll No  : "+s.getRollNo()));

		
		
		

	}

}
