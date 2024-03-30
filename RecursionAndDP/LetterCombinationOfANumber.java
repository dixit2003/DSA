package RecursionAndDP;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfANumber {
    static List<String> letterCombinations(String s) {
        return letterCombinationsHelper(s, "");
    }
    static List<String> letterCombinationsHelper(String up, String p) {
        if (up.isEmpty()) {
            List<String> temp = new ArrayList<>();
            temp.add(p);
            return temp;
        }
        List<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        int start = (digit - 2) * 3;
        if (digit > 7)
            start++;
        int end = start + 3;
        if (digit == 7 || digit == 9)
            end++;

        for (; start < end; start++) {
            ans.addAll(letterCombinationsHelper(up.substring(1), p + (char) ('a' + start)));
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}