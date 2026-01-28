package program;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the binary number ==> ");
		int decNum = sc.nextInt();		
		int BinaryNumber = convertDecimalToBinary(decNum);
		System.out.println("The decimal of  "+ decNum + "  is : "+BinaryNumber);
	
	}
	
	private static int convertDecimalToBinary(int decimalNum) {
		int binaryNumber = 0, i=0;
		while(decimalNum != 0) {
		int reminder = decimalNum % 2;
		binaryNumber +=  ( reminder * Math.pow(10, i));
		decimalNum = decimalNum/2;
		i++;
		}
		return binaryNumber;
	}

}
