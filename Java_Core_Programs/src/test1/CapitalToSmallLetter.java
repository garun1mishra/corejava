package test1;

import java.util.Scanner;

public class CapitalToSmallLetter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the sentence :  ");
		String sentence = "Image obtained with patient's arm taped to an arm board. There are fracture \r\n" + 
				"through the distal shafts of the radius and ulna. The radial fracture fragments\r\n" + 
				"show approx. 8-mm overlap with dorsaldisplacement of the distal radial fracture fragment. \r\n" + 
				"The distal ulnal shaft fracture shows ventral-lateral agulation at the fracture apex. there is no\r\n" + 
				"overriding at this fracture. On the lateral view, there is elevation of an interior and postarior fat pad.\r\n" + 
				"These findings are some concern. Repeated left wrist study is recommened.";
		
		System.out.println("Output is : \n \n ");
		
		System.out.println(sentence.toUpperCase());
		;
	}

}
