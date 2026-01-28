package april;

import java.util.HashMap;
import java.util.Map;

class Employee1 {
 int id;
 public Employee1(int id) {
	 this.id =id;
 }
	
}

 public class MainMethod {
	 
	 public static void main(String ar[]) {
		 
		 Map<Employee1, String> m= new HashMap<>();
		 Employee1 e1 = new Employee1(1);
		 Employee1 e2 = new Employee1(1);
		 Employee1 e3 = new Employee1(1);
		 m.put(e1, "A");
		 m.put(e2, "B");
		 m.put(e3, "C");
		 
		 System.out.println(m.size());
		 
	 }
	 
	 
 }