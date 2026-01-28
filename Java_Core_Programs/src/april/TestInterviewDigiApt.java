/**
 * 
 */
package april;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Garun Mishra
 *
 */
class Person {
	public String fName;
	public String lName;
	public int phoneNumber;

	public Person(String fName, String lName, int phoneNumber) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.phoneNumber = phoneNumber;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}

public class TestInterviewDigiApt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Person p1 = new Person("Richard", "Parkar", 111);
		Person p2 = new Person("Richard", "Parkar", 222);
		Person p3 = new Person("Richard", "Parkar", 333);
		Person p4 = new Person("Richard", "Parkar", 111);
		Person p5 = new Person("Steve", "Jones", 555);
		Person p6 = new Person("Steve", "Jones", 666);
		Person p7 = new Person("Teddy", "Gabriel", 999);

		List<Person> pList = new ArrayList<>();
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		pList.add(p4);
		pList.add(p5);
		pList.add(p6);
		pList.add(p7);
		Map<String, Integer> result = new HashMap<>();
		pList.stream().collect(Collectors.groupingBy(Person::getPhoneNumber, Collectors.toList())).entrySet()
				.forEach(r -> {
					String name = r.getValue().get(0).getfName() + r.getValue().get(0).getlName();
					if (result.containsKey(name)) {
						Integer count = result.get(name);
						result.put(name, count + 1);
					} else {
						result.put(name, 1);
					}
				});
		result.entrySet().forEach(rec -> {
			System.out.println(rec.getKey() + "  =======  " + rec.getValue());
		});

	}

}
