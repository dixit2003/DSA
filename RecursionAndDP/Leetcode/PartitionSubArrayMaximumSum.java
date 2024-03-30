package RecursionAndDP.Leetcode;

import java.util.Arrays;

public class PartitionSubArrayMaximumSum {
    static int maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        return maxSumAfterPartitioningHelper(0, arr, k, dp);
    }
    static int maxSumAfterPartitioningHelper(int i, int[] arr, int k, int[] dp) {
        if (i >= arr.length)
            return 0;

        if (dp[i] != -1)
            return dp[i];

        int result = 0;
        int currMax = -1;

        for (int j = i; j < arr.length && j - i + 1 <= k; j++) {
            currMax = Math.max(currMax, arr[j]);
            result = Math.max(result, (j - i + 1) * currMax + maxSumAfterPartitioningHelper(j + 1, arr, k, dp));
        }
        return dp[i] = result;
    }

    public static void main(String[] args) {
        System.out.println(maxSumAfterPartitioning(new int[]{1, 15, 7, 9, 2, 5, 10}, 3));
    }

}
