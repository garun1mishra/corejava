package april;

import java.util.HashSet;
import java.util.Set;

public class EmployeeDuplicateObjectTest {

	public static void main(String[] args) {
		Employee e1 = new Employee(12, "Garun", "Mishra");
		Employee e2 = new Employee(12, "Garun", "Mishra");
		Set<Employee> s = new HashSet<>();
		s.add(e1);
		s.add(e2);

		System.out.println(" Total record   :   " + s.size());
	}

}
