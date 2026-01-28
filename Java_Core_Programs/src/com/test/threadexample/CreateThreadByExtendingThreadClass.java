/**
 * 
 */
package com.test.threadexample;

/**
 * @author Garun Mishra
 *
 */
public class CreateThreadByExtendingThreadClass extends Thread{
public void run() {
	System.out.println("Starting thread by Extending Thread class");
}
	
	public static void main(String[] args) {
		CreateThreadByExtendingThreadClass t = new CreateThreadByExtendingThreadClass();
		t.start();
		
	}

}
