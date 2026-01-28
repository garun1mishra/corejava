/**
 * 
 */
package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Garun Mishra
 *
 */
class Dog  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int i = 10; 
	int j=20;
	String name = "Garun Mishra";
	
    // Transient variables
    transient int k = 30;
  
    // Use of transient has no impact here
    transient static int l = 40;
    transient final int m = 50;
    
    transient  int tl = 15;
    transient  int tm = 25;
    
    
	
}

public class SerializationExample{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String home = System.getProperty("user.home");
		System.out.println(" \n Home location is  :"+home);
		// Serialization
		FileOutputStream fos = new FileOutputStream(home+"\\abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		Dog d = new Dog();
		oos.writeObject(d);
		
		//De-serialization
		
		FileInputStream fis = new FileInputStream(home+"\\abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = new Dog();
		System.out.println(d2.i +"----"+d2.j+"------"+d2.name+"-------"+d2.m+"-----------"+d2.l+"-------"+d2.tm+"-----------"+d2.tl);
				

	}

}
