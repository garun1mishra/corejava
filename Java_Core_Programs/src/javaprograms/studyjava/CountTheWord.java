/**
 * 
 */
package javaprograms.studyjava;

import java.util.Scanner;

/**
 * @author Garun Mishra
 *
 */
public class CountTheWord {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//1st Ways: 
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the String");
		String str= sc1.nextLine();
		String[] word = str.trim().split(" ");
		System.out.println("Number of Word is  :"+word.length);
// 2nd Ways 
		System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int count = 1;
        for (int i = 0; i < s.length()-1; i++)     {
            if((s.charAt(i) == ' ') && (s.charAt(i+1) != ' ')){
                count++;
            }
        }
        System.out.println("Number of words in a string = "+count);
	}

}
