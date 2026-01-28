/**
 * 
 */
package hackerrank;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/** 
 * @author Garun Mishra
 *
 */
public class InitialFiveArmstrongNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the limit to which you want to pull armstrong number");
		int number = sc.nextInt();
		//int number = sc.nextInt();
	//	int number = 5;
		System.out.println("List of five intial armstrong number ");
		List<Integer> gen = Stream.iterate(0, i-> i+1) // Iterator from 0 to n-1
				.filter(i->i == Stream.of(String.valueOf(i).split("")) // Convert into string and split it by ""
				.map(Integer::valueOf) // Store each value in map as integer
				.map(n-> n*n*n) // find qube 
				.mapToInt(n->n) // map to into int for each
				.sum())// sum of all those foe all elements filter end
				.limit(number) // limit to number you want 
				.collect(Collectors.toList());	// Terminal operations to collect all elements
		System.out.println(gen);

	}

}
