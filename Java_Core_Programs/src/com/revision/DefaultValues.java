/**
 * 
 */
package com.revision;

/**
 * @author Garun Mishra
 *
 */
public class DefaultValues {

	/**
	 * @param args
	 */
	
	static int i ;
	static float f;
	static byte by ;
	static double d ;
	static char ch;
	static String str;
	static boolean bool ;
	static short sh;
	static long l;
	
	static Integer inw;
	static Character chw;
	static Boolean boolw;
	static Long lw;
	static Short shw;
	static Double dw;
		
	
	public static void main(String[] args) {
		
		System.out.println("Default  Primitive >  int "+i);
		System.out.println("Default  Primitive >  float "+f);
		System.out.println("Default  Primitive >  byte "+by);
		System.out.println("Default  Primitive > doubled "+d);
		System.out.println("Default  Primitive >  char "+ch);
		System.out.println("Default  Primitive >  string "+str);
		System.out.println("Default  Primitive >  boolean "+bool);
		System.out.println("Default  Primitive >  short "+sh);
		System.out.println("Default  Primitive >  long "+l);
		
		System.out.println("===========================================");
		System.out.println("Wrapper Non-Primitive >  Integer "+inw);
		System.out.println("Wrapper Non-Primitive >  Character "+chw);
		System.out.println("Wrapper Non-Primitive >  Boolean "+boolw);
		System.out.println("Wrapper Non-Primitive >  Long "+lw);
		System.out.println("Wrapper Non-Primitive >  Short "+shw);
		System.out.println("Wrapper Non-Primitive >  Double "+dw);
		
		System.out.println(null instanceof String);
		
		if(null instanceof String) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		System.out.println(null instanceof Object);

	}

}
