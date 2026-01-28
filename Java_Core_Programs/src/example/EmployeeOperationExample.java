/**
 * 
 */
package example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Garun Mishra
 *
 */
public class EmployeeOperationExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(101, "Garun", 101, "active", 2000));
		empList.add(new Employee(102, "Shiva", 101, "active", 10000));
		empList.add(new Employee(103, "Vijay", 102, "inactive", 20000));
		empList.add(new Employee(104, "Mishra", 101, "active", 18000));
		empList.add(new Employee(105, "Ajay", 102, "inactive", 50000));
		empList.add(new Employee(106, "Amit", 102, "active", 90000));
		empList.add(new Employee(107, "Arun", 103, "inactive", 1000));
		empList.add(new Employee(108, "Sapna", 103, "active", 100000));

		/*
		 @Program1 Write a program to print employee details working in each department. 
		 */
		List<Employee> empListStartWith =  empList.stream().filter(name-> name.getEmpName().startsWith("Ar")).collect(Collectors.toList());
		System.out.println(empListStartWith);
		
		empList.stream().filter(name-> name.getEmpName().startsWith("A")).forEach(n-> System.out.println(n.getEmpName()+" Employee Id - "+n.getEmpId()));

	}

}
