/**
 * 
 */
package com.test.threadexample;

/**
 * @author Garun Mishra
 *
 */
public class CreateThreadByRunnableInterface implements Runnable{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CreateThreadByRunnableInterface cr = new CreateThreadByRunnableInterface();
		Thread t1 = new Thread(cr);
			t1.start();
	}

	@Override
	public void run() {
	System.out.println("Thread is running..!! ");
		
	}

}
