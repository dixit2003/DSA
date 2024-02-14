package StringBuilders;
import java.util.HashMap;
import java.util.Map;
public class LongestPalindrome {
    static int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int oddCount = 0;

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            if (map.get(s.charAt(i)) % 2 == 1)
                oddCount++;
            else
                oddCount--;
        }
        if (oddCount > 1)
            return s.length() - oddCount + 1;
        else {
            return s.length();
        }
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("bananas"));
    }
}
