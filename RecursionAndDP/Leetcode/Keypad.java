package Recursions.Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Keypad {
    static List<String> letterCombinations1(String up) {
        if (up.isEmpty()) {
            return new ArrayList<>();
        }
        return letterCombinations2("", up);
    }
    static List<String> letterCombinations2(String p, String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        int start = (digit - 2) * 3;

        if (digit > 7) {
            start += 1;
        }

        int end = start + 3;

        if (digit == 7 || digit == 9) {
            end += 1;
        }

        for (int i = start; i < end; i++) {
            ans.addAll(letterCombinations2(p + (char) ('a' + i), up.substring(1)));
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations1("79"));
    }
}
