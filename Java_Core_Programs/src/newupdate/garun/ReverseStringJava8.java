package newupdate.garun;

public class ReverseStringJava8 {
    public static void main(String arg[]){
        String str = "garun";
        String revStr =  new StringBuilder(str).reverse().toString();
        System.out.println("Reverse 1  : " + revStr);
        System.out.println("Rev 2 : " + (new StringBuilder("Ajay").reverse().toString()));
        System.out.println("Rev 3 : " + (str.chars()
                .mapToObj(c -> (char)c)
                .reduce("", (s,c) -> c+s, (s1,s2) -> s2+s1)));
    }
}
