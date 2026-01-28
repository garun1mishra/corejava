package program;

import java.util.Scanner;

public class BinaryToDecimalConvert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the binary number ==> ");
		int num = sc.nextInt();		
		int decimal = convertBinaryTODecimal(num);
		System.out.println("The decimal of  "+ num + "  is : "+decimal);
	
	}
	
	private static int convertBinaryTODecimal(int binaryNum) {
		int decimaNumber = 0, i=0;
		while(binaryNum != 0) {
		int reminder = binaryNum % 10; 		
		binaryNum = binaryNum / 10;	
		
		decimaNumber = (int) (decimaNumber + ( reminder * Math.pow(2, i)));
		i++;
		}
		return decimaNumber;
	}

}
