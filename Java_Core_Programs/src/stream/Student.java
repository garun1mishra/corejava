/**
 * 
 */
package stream;

/**
 * @author Garun Mishra
 *
 */
public class Student {

	private String name; 
	private int rollNo; 
	private int age;
	private int marks;
	public Student(String name, int rollNo, int age, int marks) {	
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", age=" + age + ", marks=" + marks + "]";
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}
	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the marks
	 */
	public int getMarks() {
		return marks;
	}
	/**
	 * @param marks the marks to set
	 */
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
	
	
	
	
}
