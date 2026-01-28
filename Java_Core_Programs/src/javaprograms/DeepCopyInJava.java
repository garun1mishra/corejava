package javaprograms;

/**
 * @author Garun Mishra
 * @Title Deep cloning
 * @Description
 * Deep copy of an object will have exact copy of all the fields of original object just like shallow copy.
 * But in additional, if original object has any references to other objects as fields,
 *  then copy of those objects are also created by calling clone() method on them. That means clone object and
 *  original object will be 100% disjoint. They will be 100% independent of each other.
 * Any changes made to clone object will not be reflected in original object or vice-versa.
 */

class Course1 implements Cloneable
{
    String subject1;
 
    String subject2;
 
    String subject3;
 
    public Course1(String sub1, String sub2, String sub3)
    {
        this.subject1 = sub1;
 
        this.subject2 = sub2;
 
        this.subject3 = sub3;
    }
 
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
 
class Student1 implements Cloneable
{
    int id;
 
    String name;
 
    Course1 Course1;
 
    public Student1(int id, String name, Course1 Course1)
    {
        this.id = id;
 
        this.name = name;
 
        this.Course1 = Course1;
    }
 
    //Overriding clone() method to create a deep copy of an object.
 
    protected Object clone() throws CloneNotSupportedException
    {
        Student1 Student1 = (Student1) super.clone();
 
        Student1.Course1 = (Course1) Course1.clone();
 
        return Student1;
    }
}


public class DeepCopyInJava {

	public static void main(String[] args) {
		  Course1 science = new Course1("Physics", "Chemistry", "Biology");
	       
	        Student1 Student11 = new Student1(111, "John", science);
	 
	        Student1 Student12 = null;
	 
	        try
	        {
	            //Creating a clone of Student11 and assigning it to Student12
	 
	            Student12 = (Student1) Student11.clone();
	        }
	        catch (CloneNotSupportedException e)
	        {
	            e.printStackTrace();
	        }
	 
	        //Printing the subject3 of 'Student11'
	 
	        System.out.println(Student11.Course1.subject3);         //Output : Biology
	 
	        //Changing the subject3 of 'Student12'
	 
	        Student12.Course1.subject3 = "Maths";
	 
	        //This change will not be reflected in original Student1 'Student11'
	 
	        System.out.println(Student11.Course1.subject3);       //Output : Biology
	}

}
