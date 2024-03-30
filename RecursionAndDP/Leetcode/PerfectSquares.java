package RecursionAndDP.Leetcode;

import java.util.Arrays;

public class PerfectSquares {
    static int numSquares(int n) {
        int[] dp = new int[10001];
        Arrays.fill(dp, -1);
        return helper(n, dp);
    }
    static int helper(int n, int[] dp) {
        if (n == 0)
            return 0;

        if (dp[n] != -1)
            return dp[n];

        int minCount = Integer.MAX_VALUE;

        for (int i = 1; i * i <= n; i++) {
            int result = 1 + helper(n - i * i, dp);
            minCount = Math.min(minCount, result);
        }
        dp[n] = minCount;
        return minCount;
    }

    public static void main(String[] args) {
        System.out.println(numSquares(12));
    }
}
