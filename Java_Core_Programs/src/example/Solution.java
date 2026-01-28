package example;

import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;
public class Solution {

	 private static final Scanner scan = new Scanner(System.in);
	    
     static  String readFile(String fileName) throws IOException {       
             try (FileReader fr = new FileReader(fileName);
                BufferedReader br = new BufferedReader(fr)){
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();
                while (line != null) {
                    String[] temp = line.split(" ");
                    String tempRes = temp[6];           
                    String lastWord = tempRes.substring(tempRes.lastIndexOf("/") + 1);
                    // System.out.println("Tem Response : " +lastWord);
//                    String gif_format = ".gif";
                     String gif_format = "1702";
                    String tempRes_200 = temp[8]; // to get status code 
                    if(tempRes_200.contains("200")){ // check for status code 
                        if(lastWord.toLowerCase().contains(gif_format.toLowerCase())){
                        sb.append(lastWord);
                        sb.append("\n");
                    }   
                   }                                     
                    line = br.readLine();                   
                }            
                return sb.toString();
            } 
        }
    
    public static void main(String args[]) throws Exception {
        // read the string filename
      //  String filename;
      String filename   = "C:\\Users\\Garun Mishra\\Desktop\\log.txt";
      //  filename = scan.nextLine();   
            String data = readFile(filename);
            String resultFileName = "gifs_"+filename;
           try(OutputStream os = new FileOutputStream(new File(resultFileName), true)) {
               os.write(data.getBytes(), 0, data.length());
            } catch (IOException e) {
                e.printStackTrace();
            } 
       
        
    }
}
