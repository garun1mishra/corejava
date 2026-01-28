package Jan_Preparation_2025;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RemoveSpecialCharacter {
    public static void main(String[] args) {
        String input= "R@$vin*(dr!a";
        List<Character> forbidden = Arrays.asList('@','$','*', '(', '!');
        String result = new StringBuilder(input.replaceAll(
                forbidden.stream()
                        .map(String::valueOf)
                        .map(Pattern::quote)
                        .collect(Collectors.joining("|")), "")).reverse().toString();

        System.out.println(result);
    }
}
