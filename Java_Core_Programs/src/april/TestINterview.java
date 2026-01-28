/**
 * 
 */
package april;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Garun Mishra
 *
 */


 class Student {

    private String name;
    private String gender;
    private String nativeCity;
    private int math;
    private int history;
    private int science;
	
    public Student(String name, String gender, String nativeCity, int math, int history,int science) {
        this.name = name;
        this.gender = gender;
        this.nativeCity = nativeCity;
        this.math = math;
        this.history = history;
        this.science = science;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNativeCity() {
		return nativeCity;
	}

	public void setNativeCity(String nativeCity) {
		this.nativeCity = nativeCity;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getHistory() {
		return history;
	}

	public void setHistory(int history) {
		this.history = history;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}
	
	public static int sumNumber(int a, int b, int c) {
		return (a+b+c);
	}
}
public class TestINterview {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		 List<Student> list = new ArrayList<>();
   	       list.add(new Student("Ramesh", "Male", "Delhi", 10, 20, 30));
	        list.add(new Student("Suresh", "Male", "Delhi", 40, 90, 80));
	        list.add(new Student("Dinesh", "Male", "Hyderabad", 30, 120, 40));
	        list.add(new Student("Akhilesh", "Male", "Hyderabad", 40, 20, 50));
	        list.add(new Student("Tina", "Female", "Delhi", 23, 12,67));
			list.add(new Student("Bina", "Female", "Delhi", 10, 20, 30));
	        list.add(new Student("Satisha", "Male", "Bangalore", 40, 90, 80));
	        list.add(new Student("Nitin", "Male", "Hyderabad", 30, 120, 40));
	        list.add(new Student("Sanya", "Female", "Hyderabad", 40, 20, 50));
	        list.add(new Student("Bailey", "Female", "Delhi", 23, 12,67));

	        int male_count = (int) list.stream().filter(emp-> emp.getGender().equals("Male")).count();
	        int female_count = (int) list.stream().filter(emp-> emp.getGender().equals("Female")).count();
	        
	        System.out.println("Total Male : "+male_count);
	        System.out.println("Total Female : "+female_count);
// 
//	        list.stream().
//	        collect(Collectors.groupingBy(student -> ((Student) student).getHistory() + ((Student) student).getMath() + ((Student) student).getScience(), Collectors.maxBy(Comparator.reverseOrder()));

	        List<Integer> numbers = Arrays.asList(new Integer[]{1,2,1,3,4,4});
	        numbers.stream().filter(i-> Collections.frequency(numbers, i) > 1).collect(Collectors.toSet()).forEach(rec -> System.out.println(rec+" "));

	}

}

/**
Give me a number of female and male students .
Give me students who live in Hyderabad.
Find out who is holding first rank
Find duplicates in List<Integer> numbers = Arrays.asList(new Integer[]{1,2,1,3,4,4}); 
*/