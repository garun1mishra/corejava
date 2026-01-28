package stringprogram.java8;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateWord {

    public static void main(String a[]){
        String str = "My name is Garun. Garun is working in Hitachi";
        Map<String, Integer> m = new HashMap<>();
        String word[] =  str.split(" ");
        for(int c = 0; c < word.length -1 ; c++){
            if(m.containsKey(word[c])){
                m.put(word[c], m.get(word[c]) + 1);
            } else{
                m.put(word[c], 1);
            }
        }
        

        m.entrySet().stream().filter(stringIntegerEntry -> "Garun".equalsIgnoreCase(stringIntegerEntry.getKey())).forEach(rec-> {
            System.out.println(rec.getKey() +  " ---- "+rec.getValue());
        });
        
        char ch[] = {'c', 'o', 'd', 'e'};
        String st = new String(ch);
          System.out.println(st); 
    }

}
