/**
 * 
 */
package example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/**
 * @author Garun Mishra
 * @ListOfPrograms 
 * @Program1 Write a program to print employee details working in each department. 
 * @Program2 Write a program to employee count working in each department
 * @Program3 Write a program to print active and inactive employee in given collections
 * @Program4 Write a program to print max/ min employee salary from the given collections 
 * @Program5 Write a program to max salary of employee from each department
 * @Program6 Write a program to min salary of employee from each department
 * @Program7 Write a program to get employee details whose name start with S
 * @Program8 Write a program to get employee details whose name end with a
 *
 */
public class EmployeeOperationExampleJ8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(101, "Garun", 101, "active", 2000));
		empList.add(new Employee(102, "Shiva", 101, "active", 10000));
		empList.add(new Employee(103, "Vijay", 102, "inactive", 20000));
		empList.add(new Employee(104, "Mishra", 101, "active", 18000));
		empList.add(new Employee(105, "Saurabh", 102, "inactive", 50000));
		empList.add(new Employee(106, "Amit", 102, "active", 90000));
		empList.add(new Employee(107, "Jyoti", 103, "inactive", 1000));
		empList.add(new Employee(108, "Sapna", 103, "active", 100000));

		/*
		 @Program1 Write a program to print employee details working in each department. 
		 */
		
		//1st Way
		 System.out.println();
		  System.out.println("------ Write a program to print employee details working in each department  -----");
			 System.out.println();
		empList.stream().collect(Collectors.groupingBy(Employee :: getDeptId, Collectors.toList())).entrySet()
		.forEach(entry -> {
			System.out.println(entry.getKey() +"------"+entry.getValue());
		});
		// 2nd Way
		 System.out.println();
		System.out.println("------ Write a program to print employee details working in each department  -----");
		 System.out.println();
		Map<Integer, List<Employee>> empBasedOnDdept = empList.stream().collect(Collectors.groupingBy(Employee :: getDeptId, Collectors.toList()));
		empBasedOnDdept.entrySet()
		.forEach(entry -> {
			System.out.println(entry.getKey() +"------"+entry.getValue());
		});
		
		/* @Program2 Write a program to employee count working in each department */
		System.out.println();
		System.out.println("------ Write a program to employee count working in each department  -----");
		 System.out.println();
		Map<Integer, Long> empCountBasedOnDdept  = empList.stream().collect(Collectors.groupingBy(Employee :: getDeptId, Collectors.counting()));
		empCountBasedOnDdept.entrySet().forEach(entry->{ 
			System.out.println("Dept "+entry.getKey() +" ----- "+entry.getValue());
		});
		
		/* @Program3 Write a program to print active and inactive employee in given collections  */
		 System.out.println();
		System.out.println("------ Write a program to print active and inactive employee in given collections  -----");
		 System.out.println();
		
		  long activeEmpCount =    empList.stream().filter(e-> "active".equalsIgnoreCase(e.getStatus())).count();
		  long inactiveEmpCount =    empList.stream().filter(e-> "inactive".equalsIgnoreCase(e.getStatus())).count();
		  System.out.println("Active Employee COunt is  = "+activeEmpCount);
		  System.out.println("Inactive Employee Count is  = "+inactiveEmpCount);
		
		/* @Program4 Write a program to print max/ min employee salary from the given collections   */
		  System.out.println();
		  System.out.println("------ Write a program to print max/ min employee salary from the given collections  -----");
			 System.out.println();
		 Optional<Employee> maxEmp = empList.stream().max(Comparator.comparing(Employee :: getSalary));
		 Optional<Employee> minEMp = empList.stream().min(Comparator.comparing(Employee :: getSalary));
		 
		 System.out.println(maxEmp);
		 System.out.println(minEMp);
		
		/* @Program5 Write a program to max salary of employee from each department */
		 System.out.println();
		 System.out.println("------ Write a program to max salary of employee from each department -----");
		 System.out.println();
		 Map<Integer, Optional<Employee>> empMaxBasedOnDdept =
				 empList.stream().collect(Collectors.groupingBy(Employee::getDeptId, 
						 Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary))))
						 );	
		 empMaxBasedOnDdept.entrySet().forEach(emp->{
			 System.out.println("Dept Id => "+emp.getKey() + " -------  "+emp.getValue());
		 });			
		
		 /* @Program6 Write a program to min salary of employee from each department */
		 System.out.println();
		 System.out.println("------ Write a program to min salary of employee from each department -----");
		 System.out.println();
		 Map<Integer, Optional<Employee>> empMinBasedOnDdept =
				 empList.stream().collect(Collectors.groupingBy(Employee::getDeptId, 
						 Collectors.reducing(BinaryOperator.minBy(Comparator.comparing(Employee::getSalary))))
						 );	
		 empMinBasedOnDdept.entrySet().forEach(emp->{
			 System.out.println("Dept Id => "+emp.getKey() + " -------  "+emp.getValue());
		 });	
		 
//		 * @Program7 Write a program to get employee details whose name start with S
		 System.out.println();
		 System.out.println("------ Write a program to get employee details whose name start with S -----");
		 System.out.println();
		 empList.stream().filter(emp -> emp.getEmpName().startsWith("S")).forEach(emp-> System.out.println(emp));
		 
//		 * @Program8 Write a program to get employee details whose name end with a 
		 System.out.println();
		 System.out.println("------ Write a program to get employee details whose name end with a -----");
		 System.out.println();
		 empList.stream().filter(emp -> emp.getEmpName().endsWith("h")).forEach(emp-> System.out.println(emp));
		 
	}

}
