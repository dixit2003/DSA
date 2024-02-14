package Hashing;

import java.util.*;

public class GroupAnagram {
    static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        if (strs.length == 0) {
            return list;
        }
        if (strs.length == 1) {
            list.add(new ArrayList<>());
            list.get(0).add(strs[0]);
            return list;
        }

        Map<String, List<String>> map = new HashMap<>();

        for (String word: strs) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"}));
    }
}
