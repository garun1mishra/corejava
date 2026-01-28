package table;

import java.util.Scanner;

public class MissingElementfromArray {

	public static void main(String[] args) {	
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the length of array : ");
		 			int len  = sc.nextInt();
		 System.out.println("Enter the Element of array : ");
		 int array [] = new int[len];
	  for(int i =0; i<= len -1 ; i++)  array [i] = sc.nextInt();
	  
	  findMissingElementsApproach1(array);
	  findMissingElementsApproach2(array);  
	  // [2,5,8,9,10]
		  
	  
	}

	private static void findMissingElementsApproach2(int[] array) {
	   int len = array.length;
	   int check [] = new int [array[len - 1] + 1];
		for(int i=0; i<len ; i++) check[array[i]] = 1;
		for(int i=array[0]; i <= array[len - 1]; i++) {
			if(check[i] == 0) System.out.println(i + "  ");
	}
	}
	private static void findMissingElementsApproach1(int[] array) {
	   boolean check= false;
		System.out.println("Missing elements are ");
		for(int i =0; i < array.length - 1 ; i++) {
			if(array[i+1] - array[i] > 1 ) {
				check = true;
				for(int j = array[i] ; j < array[i+1]; j++) {
					if(j+1 != array[i+1]) System.out.print("  " +(j+1)+ " ");
				}
			}			
			
		}
		
		if(!check) System.out.println("There is no missing element in array");
	}
	

}
