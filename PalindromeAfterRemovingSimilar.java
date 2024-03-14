import ObjectOrientedProgramming.Interfaces.A;

import java.util.Arrays;

public class PalindromeAfterRemovingSimilar {
    static boolean isPalindrome(String s1, String s2) {
        int[] arr = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            arr[s2.charAt(i) - 'a']--;
        }
        int oddCount = 0;
        int len = 0;

        for (int i = 0; i < 26; i++) {
            if (arr[i] % 2 == 1) {
                oddCount++;
            }
            len += arr[i];
        }

        if (len % 2 == 0) {
            return oddCount == 0;
        } else {
            return oddCount == 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abcdeeefe", "abcdee"));
    }
}
