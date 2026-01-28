package table;

import java.util.Scanner;

public class TableExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number for the table");
		int num = sc.nextInt();
		
		/*
		 * for( int i=1; i <=10; i++) { System.out.println(num + " * " + i +
		 * " = "+(num*i)); }
		 */
		
		for(int j=1; j<=num; j++) {
			System.out.println("Table of  "+ j);	
			for( int i=1; i <=10; i++) {
				System.out.println(j + " * " + i + " = "+(j*i));
			}
	
			System.out.println();
		}
		
	}

}
