package stringprogram.java8;

public class CountNumberOFWowels {
    public static void main(String s[]){
        String str = "Garun";
       long count  =  str.chars().filter(c-> {
            return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
        }).count();
     System.out.println(count);

    }

}
