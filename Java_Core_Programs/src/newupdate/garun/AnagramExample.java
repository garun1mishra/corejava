package newupdate.garun;
import java.util.Arrays;
public class AnagramExample {
    public static void main(String a[]){
        String str1 = "abcdgf";
        String str2 = "afcdbg";
         char [] ch1 = str1.toCharArray();
         char [] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1, ch2)){
            System.out.println("Strings are anagram");
        }
    }
}
