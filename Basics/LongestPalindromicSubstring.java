package Basics;

public class LongestPalindromicSubstring {
    static String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = lengthOfPalindrome(s, i, i); // For odd palindrome
            int len2 = lengthOfPalindrome(s, i, i+1); //For Even palindrome
            int len = Math.max(len1, len2);

            if(len > end - start) {
                start = i - ((len - 1) / 2);
                end = i + (len / 2);

            }
        }
        return s.substring(start, end + 1);

    }
    static int lengthOfPalindrome(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("ABRBADAADAB"));
    }
}
