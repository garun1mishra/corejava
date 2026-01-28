/**
 * 
 */
package com.revision;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



/**
 * @author Garun Mishra
 *
 */
public class SerializationTest {

	/**
	 * @param args
	 */
	
	// Normal variables
    int i = 10, j = 20;
  
    // Transient variables
    transient int k = 30;
  
    // Use of transient has no impact here
    transient static int l = 40;
    transient final int m = 50;
    
    
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
	  
	    SerializationTest input = new SerializationTest();
  
        // serialization
        FileOutputStream fos = new FileOutputStream("E:\\abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(input);
  
        // de-serialization
        FileInputStream fis = new FileInputStream("E:\\abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        SerializationTest output = (SerializationTest)ois.readObject();
        System.out.println("i = " + output.i);
        System.out.println("j = " + output.j);
        System.out.println("k = " + output.k);
        System.out.println("l = " + output.l);  
        System.out.println("m = " + output.m);
	  
	}

}
