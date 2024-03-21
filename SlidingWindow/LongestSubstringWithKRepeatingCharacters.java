package SlidingWindow;

import java.util.HashMap;
import java.util.Map;


public class LongestSubstringWithKRepeatingCharacters {
    static int longestSubstring(String s, int k) {
        if (s.length() < k || s.length() == 0) return 0;
        if (k == 1) return s.length();

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int l = 0;
        for (int i = 0; i < s.length() && map.get(s.charAt(i)) >= k; i++) {
            l++;
        }
        if (l >= s.length() - 1) return l;

        int l1 = longestSubstring(s.substring(0, l), k);

        while (l < s.length() && map.get(s.charAt(l)) < k) {
            l++;
        }
        int l2 = longestSubstring(s.substring(l), k);

        return Math.max(l1, l2);
    }

    public static void main(String[] args) {
        System.out.println(longestSubstring("bbaaacddcaabdbd", 3));
    }
}
