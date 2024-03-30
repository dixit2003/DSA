package RecursionAndDP.Leetcode;

import java.util.Arrays;

public class EditDistance {
    static int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n][m];

        for (int row[]: dp) {
            Arrays.fill(row, -1);
        }
        return minDistanceHelper(n - 1, m - 1, word1, word2, dp);
    }
    static int minDistanceHelper(int i, int j, String word1, String word2, int[][] dp) {
        if (i < 0) {
            return j + 1;
        }
        if (j < 0) {
            return i + 1;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        if (word1.charAt(i) == word2.charAt(j))
            return minDistanceHelper(i - 1, j - 1, word1, word2, dp);
        else {
            int insert = minDistanceHelper(i, j - 1, word1, word2, dp);
            int delete = minDistanceHelper(i - 1, j, word1, word2, dp);
            int replace = minDistanceHelper(i - 1, j - 1, word1, word2, dp);

            return dp[i][j] = 1 + Math.min(Math.min(insert, delete), replace);
        }
    }

    public static void main(String[] args) {
        System.out.println(minDistance("intention", "execution"));
    }
}
