package newupdate.garun;

import java.io.FileNotFoundException;

public class ReturnTest {
    public static void main(String[] args) {
        try {
            int x = addNumber(3, 4);
            System.out.println(x);
        } catch (Exception exception) {
            System.out.println("catching exception in main");
        } finally {
            System.out.println("finally in main");
        }
    }

    private static int addNumber(int a, int b) {
        int k =10;
        try {
            final String key;
            key = "hello";
            //key = "world";
            System.out.println(a + b);
            throw new FileNotFoundException("file nai mila");
            //return a+b;
        } catch (Exception exception) {
            System.out.println(exception);
            return k;
            //  throw new RuntimeException("test exception");
        } finally {
            System.out.println("finally block of add number");
            return k+10;
        }

    }
}
