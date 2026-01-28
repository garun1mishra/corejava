/**
 * 
 */
package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



/**
 * @author Garun Mishra
 *
 */
public class EmployeeOperation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Employee> employeeList = createEmployeeList();
		
//        List<String> employeeFilteredList = employeeList.stream()
//                  .filter(e->e.getAge()>20)
//                  .map(Employee::getName)
//                  .collect(Collectors.toList());
// 
//        employeeFilteredList.forEach((name)-> System.out.println(name));
		
        List<String> employeeNames = employeeList
                .stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
String employeeNamesStr = String.join("  ", employeeNames);
System.out.println("Employees are: "+employeeNamesStr);
		
		

	}
	public static List<Employee> createEmployeeList()
    {
        List<Employee> employeeList=new ArrayList<>();
 
        Employee e1=new Employee("John",21);
        Employee e2=new Employee("Martin",19);
        Employee e3=new Employee("Mary",31);
        Employee e4=new Employee("Stephan",18);
        Employee e5=new Employee("Gary",26);
 
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
 
        return employeeList;
    }
	
}
