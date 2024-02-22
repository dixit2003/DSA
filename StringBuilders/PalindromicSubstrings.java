package StringBuilders;

import java.util.Arrays;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        System.out.println(countSubstrings("aaa"));
    }
    static int count = 0;
    static int countSubstrings(String str) {
        boolean[][] dp = new boolean[str.length()][str.length()];

        for (int l = 1; l <= str.length(); l++) {
            for (int i = 0; i + l - 1 < str.length(); i++) {
                int j = i + l - 1;

                if (i == j) {
                    dp[i][j] = true;
                }
                else {
                    boolean s = str.charAt(i) == str.charAt(j);
                    if (i + 1 == j) {
                        dp[i][j] = s;
                    }
                    else {
                        dp[i][j] = s && dp[i + 1][j - 1];
                    }
                }
                if (dp[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
