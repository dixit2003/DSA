package Recursions.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    static List<List<String>> partition(String s) {
        return partitionHelper(s, new ArrayList<>());
    }
    private static List<List<String>> partitionHelper(String s, List<String> list) {
        if (s.isEmpty()) {
            List<List<String>> temp = new ArrayList<>();
            temp.add(new ArrayList<>(list));
            return temp;
        }
        List<List<String>> ans = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(0, i + 1);
            if (isPalindrome(str)) {
                list.add(str);
                ans.addAll(partitionHelper(s.substring(i + 1), list));
                list.remove(list.size() - 1);
            }
        }
        return ans;
    }
    private static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(partition("aabb"));
    }
}
