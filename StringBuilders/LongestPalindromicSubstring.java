package StringBuilders;

public class LongestPalindromicSubstring {
    static String longestSubstring(String str) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < str.length(); i++) {
            int len1 = lengthOfPalindrome(str, i, i);
            int len2 = lengthOfPalindrome(str, i, i+1);

            int max = Math.max(len1, len2);

            if (max > end - start) {
                start = i - ((max - 1) / 2);
                end = i + ((max) / 2);
            }
        }
        return str.substring(start, end + 1);
    }

    static int lengthOfPalindrome(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        System.out.println(longestSubstring("madam"));
    }
}
