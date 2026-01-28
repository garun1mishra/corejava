package newupdate.garun;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatative {

    public static void main(String a[]) {
        String str = "rabc7YzxBCARX1";
        char[] splitChar = str.toLowerCase().toCharArray();
        System.out.println(splitChar);
        HashMap<Character, Integer> map = new HashMap<>();
        for (int ch = 0; ch < splitChar.length - 1; ch++) {
            if (map.containsKey(splitChar[ch])) {
                map.put(splitChar[ch], map.get(splitChar[ch]) + 1);
            } else {
                map.put(splitChar[ch], 1);
            }
        }
        for (Map.Entry<Character, Integer> value : map.entrySet()) {
            if (value.getValue() == 1) {
                System.out.println(value.getKey() + " ----- " + value.getValue());
            }
        }
    }
}
