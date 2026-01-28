package misc;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class PrimeNumbers {
    public static void main(String s[]){
  long count  = IntStream.range(0, 100).boxed().filter(n -> BigInteger.valueOf(n).isProbablePrime(1))
          .count();
  System.out.println(count);

        IntStream.range(1, 100).boxed().filter(n -> BigInteger.valueOf(n).isProbablePrime(1))
                .forEach(v-> System.out.println(v));

    }

    }



