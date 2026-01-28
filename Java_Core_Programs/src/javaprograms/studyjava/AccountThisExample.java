/**
 * 
 */
package javaprograms.studyjava;

/**
 * @author Garun Mishra
 *
 * @Description 
 * Keyword THIS is a reference variable in Java that refers to the current object.

The various usages of 'this' keyword in Java are as follows:

It can be used to refer instance variable of current class
It can be used to invoke or initiate current class constructor
It can be passed as an argument in the method call
It can be passed as argument in the constructor call
It can be used to return the current class instance
 */
public class AccountThisExample {

	// instance variables
		int a; 
		int b;  
		
		// ANswer will be 0, 0
		public void setData1(int a, int b) {
			a=a;
			b=b;
		}
		// Answer will be 2, 5
		
//		public void setData(int c, int d) {
//			a=c;
//			b=d;
//		}
		
		// ANswer will  2, 5
//		public void setData(int a, int b) {
//			this.a=a;
//			this.b=b;
//		}

		// ANswer will  2, 5
		public void setData(int c, int d) {
			this.a=c;
			this.b=d;
		}
		
		public void showData() {
			System.out.println("Value of A : "+a);
			System.out.println("Value of B : "+b);
		}
	
	public static void main(String[] args) {
		AccountThisExample acc =  new AccountThisExample();
		acc.setData1(2, 5);
		//acc.setData(2, 5);
		acc.showData();

	}

}
