package javaprograms;

import java.util.Arrays; 
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NthHighestNumberFromArray {
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = { 12, 13, 1, 10, 34, 16 };
        System.out.println("Please enter the highest number : ");
        int n = sc.nextInt();
        System.out.println(Arrays.stream(arr).boxed().collect(Collectors.toList()).stream().sorted().collect(Collectors.toList()).get(arr.length-n));
   
        
        List<Integer> l = Arrays.asList(2,3,6,4,5,8);
    System.out.println(l.stream().filter(r-> r %2 ==0).collect(Collectors.toList()));
    
    
    }
}
