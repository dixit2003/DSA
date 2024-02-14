package StringBuilders;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    static boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] arr = s.split(" ");

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                if (!map.get(c).equals(arr[i])) {
                    return false;
                }
            }
            else {
                if (map.containsValue(arr[i])) {
                    return false;
                }
            }
            map.put(c, arr[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("aaaa", "dog cat cat dog"));
    }
}
