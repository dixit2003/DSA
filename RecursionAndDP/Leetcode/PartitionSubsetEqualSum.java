package RecursionAndDP.Leetcode;

import java.util.Arrays;

public class PartitionSubsetEqualSum {

    static boolean canPartition(int[] nums) {
        int target = Arrays.stream(nums).sum();

        if (target % 2 == 1) {
            return false;
        }

        target /= 2;
        int n = nums.length;

        // dp[i][j] will be true if there is a subset of elements in nums[0 - i-1]
        // with a sum equal to j.
        Boolean[][] dp = new Boolean[n + 1][target + 1]; // Using Boolean to represent uninitialized state.

        // An empty subset can always have a sum of 0.
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        return canPartitionHelper(nums, dp, 0, target);
    }

    static boolean canPartitionHelper(int[] nums, Boolean[][] dp, int start, int target) {
        if (target == 0) {
            return true;
        }
        if (target < 0 || start == nums.length)
            return false;

        if (dp[start][target] != null) {
            return dp[start][target];
        }

        dp[start][target] = canPartitionHelper(nums, dp, start + 1, target - nums[start]) ||
                canPartitionHelper(nums, dp, start + 1, target);

        return dp[start][target];
    }

    public static void main(String[] args) {
        System.out.println(canPartition(new int[]{1, 5, 11, 5}));
    }
}
