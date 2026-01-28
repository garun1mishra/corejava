package newupdate.garun;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSort {
    public static void main(String arges[]){
        HashMap<String, Integer> hm
                = new HashMap<String, Integer>();

        hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);
        // way 1
        System.out.println("Before : ");
        for (Map.Entry<String, Integer> en :
                hm.entrySet()) {
            System.out.println("Key = " + en.getKey()
                    + ", Value = "
                    + en.getValue());
        }
        Map<String, Integer> hm1 = hm.entrySet()
                .stream()
                .sorted((i1, i2)
                        -> i1.getValue().compareTo(
                        i2.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println("After : ");

        for (Map.Entry<String, Integer> en : 
                hm1.entrySet()) {
            System.out.println("Key = " + en.getKey()
                    + ", Value = "
                    + en.getValue());
        }

    }

}
