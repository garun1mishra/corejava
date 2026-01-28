package newupdate.garun;

import java.util.Random;

public class RandomNumber {

   public static void main(String args[]){

//       How do you print ten random numbers using forEach?
       Random random = new Random();
       System.out.println("10 Random Numbers \n ");
       random.ints().limit(10).forEach(System.out::println);




   }

}
