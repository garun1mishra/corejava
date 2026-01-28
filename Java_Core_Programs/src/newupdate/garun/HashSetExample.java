package newupdate.garun;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static <emp> void main(String a[]){
        Set<Employee> set = new HashSet<>();
        Employee e1 =  new Employee(1, "garun");
        Employee e2 =  new Employee(1, "garun");
        set.add(e1);
        set.add(e2);
        System.out.println("Size  : "+set.size());
set.stream().forEach(emp -> {
//    System.out.println("Id  : "+e.toString());
    System.out.println("Id  : "+emp.getId());
    
});
}
}
