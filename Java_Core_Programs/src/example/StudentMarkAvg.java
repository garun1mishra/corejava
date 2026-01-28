package example;

/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates 
 * and open the template in the editor. */ 


 /** * * @author Admin */ 

class Student{ 

    int rollno; 
    String name; 
    int sub1; 
    int sub2; 
    int Avg; 
    void get(String n, int r, int a, int b) { 
        rollno = r; 
        name = n; 
        sub1 = a; 
        sub2 = b; 
} 

void disp() { 
    Avg = (sub1 + sub2)/2; 
    System.out.println("Rollno=" + rollno); 
    System.out.println("Name=" + name); 
    System.out.println("Sub1=" + sub1); 
    System.out.println("Sub2=" + sub2); 
    System.out.println("Average=" + Avg); 
    } 
} 

public class StudentMarkAvg { 
    public static void main(String[] args){ 
        Student s1 = new Student(); 
        Student s2 = new Student(); 
        Student s3 = new Student(); 
        s1.get("Ram",16345,21,78); 
        s2.get("Judith", 26312, 77,91);
 
        s3.get("Lee", 32132, 85, 65); 
        s1.disp(); 
        s2.disp(); 
        s3.disp(); 
     } 
}