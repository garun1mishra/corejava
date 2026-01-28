package javaprograms;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseStringNonRecursive {
	public static void main(String[] args) {    String name = "Garun Mishra";
//		System.out.print(new StringBuilder(name).toString() + " ");
//		System.out.print(new StringBuilder(name).reverse().toString() + " ");
		reverseEachWordOfString(name);
	}
	private static void reverseEachWordOfString(String inputString) {
//					System.out.print(new StringBuilder(inputString).reverse().toString() + " ");
		//		System.out.println(inputString.chars().mapToObj(c -> (char)c).reduce("", (s,c) -> c+s, (s1,s2) -> s2+s1));
		//		System.out.println(Stream.of(inputString).map(word->new StringBuilder(word).reverse()).collect(Collectors.joining(" ")));

		Stream.of(inputString).forEach(word -> {
//			System.out.print(word);
			System.out.println(new StringBuilder(word).reverse().toString() + " ");
		});
	}
}
