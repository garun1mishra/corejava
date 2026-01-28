/**
 * 
 */
package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Garun Mishra
 *
 */
public class ReadWordCharLineFromFile {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(new FileInputStream( new File("C:\\Users\\Garun Mishra\\Desktop\\log.txt"))));
		String line;
        int wordCount = 0, characterCount = 0, paraCount = 0,  whiteSpaceCount = 0, sentenceCount = 0;
        while((line = bfr.readLine()) != null) {
        	if (line.equals("")) {
                paraCount += 1;
            }
            else {
                characterCount += line.length();
                String words[] = line.split("\\s+");
                wordCount += words.length;
                whiteSpaceCount += wordCount - 1;
                String sentence[] = line.split("[!?.:]+");
                sentenceCount += sentence.length;
            }
        }
        if (sentenceCount >= 1) {
            paraCount++;
        }
        System.out.println("Total word count = "+ wordCount);
        System.out.println("Total number of sentences = "+ sentenceCount);
        System.out.println("Total number of characters = "+ characterCount);
        System.out.println("Number of paragraphs = "+ paraCount);
        System.out.println("Total number of whitespaces = "+ whiteSpaceCount);
 
		
	}

}
