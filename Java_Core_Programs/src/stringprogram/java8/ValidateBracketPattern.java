package stringprogram.java8;

import java.util.Scanner;

import java.util.Stack;

public class ValidateBracketPattern {
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Pattern : ");
        char [] charArray = sc.nextLine().toCharArray();
        if(validatePatter(charArray)){
            System.out.println("Pattern is correct : ");
        }else{
            System.out.println("Pattern is not correct : ");
        }
    }

    private static boolean validatePatter(char[] charArray) {
        Stack<Character> container = new Stack<>();

        for (char c : charArray) {
            if (c == ' ') {
                continue;
            }
            if (c == '(' || c == '{' || c == '[') {
                container.push(c);
            } else if (c == ')' && container.peek() == '('
                    || (c == '}' && container.peek() == '{')
                    || (c == ']' && container.peek() == '[')) {
                container.pop();
            } else {
                return false;
            }

        }
        return container.isEmpty();
    }

}
