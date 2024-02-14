package Miscellaneous;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Length3palindromicStrings {
    static int length3Palindromes(String str) {
        int ans = 0;
        HashMap<Character, int[]> map = new HashMap<Character, int[]>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!map.containsKey(str.charAt(i))) {
                map.put(ch, new int[]{-1, -1});
            }
        }
        //First Index
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int[] indices = map.get(ch);

            if (indices[0] == -1) {
                indices[0] = i;
            }
        }
        //Last Index
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            int[] indices = map.get(ch);

            if (indices[1] == -1) {
                indices[1] = i;
            }
        }
        //Traverse through the map
        for (Map.Entry<Character, int[]> entry : map.entrySet()) {
            char ch = entry.getKey();
            int[] pos = entry.getValue();
            int start = pos[0];
            int end = pos[1];

            Set<Character> un = new HashSet<>();

            for (int i = start + 1; i <= end - 1; i++) {
                un.add(str.charAt(i));
            }
            ans += un.size();
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(length3Palindromes("bbcbaba"));
    }
}
