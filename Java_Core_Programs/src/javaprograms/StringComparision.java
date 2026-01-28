/**
 * 
 */
package javaprograms;

/**
 * @author GarunMishra
 * @Description: In general both equals() and �==� operator in Java are used to compare objects to check equality but
   here are some of the differences between the two:
  @1. Main difference between .equals() method and == operator is that one is method and other is operator.
  @2. We can use == operators for reference comparison (address comparison) and .equals() method for content comparison.
      In simple words, == checks if both objects point to the same memory location whereas .equals() evaluates to the
      comparison of values in the objects.
  @3. If a class does not override the equals method, then by default it uses equals(Object o) method of the closest
      parent class that has overridden this method.
  @4. When you create String object using new() operator, it always create a new object in heap memory. On the other hand,
      if you create object using String literal syntax e.g. "Java",  it may return an existing object from String pool
      if it's already exists.
 *
 */
public class StringComparision {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Scenario 1
				String name1 = new String("HELLO");
		        String name2 = new String("HELLO");
		        String name3 =  name1;
		        System.out.println(name1 == name2); //false - references are vary
		        System.out.println(name1.equals(name2)); //true   -- contents are same
		        System.out.println(name1 == name3); //true
		        //Scenario 2[
		        String sname1 = "HELLO";
		        String sname2 = "HELLO";
		        String sname3 =  name1;
		        System.out.println(sname1 == sname2); //true
		        System.out.println(sname1.equals(sname2)); //true
		        System.out.println(sname1 == sname3); //false
		        System.out.println(sname1.equals(sname3)); //true
	}

}
