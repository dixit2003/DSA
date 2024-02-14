package Recursions.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class HouseRobber {
    // House Robber 1
    static int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        return robHelper(nums, dp, nums.length - 1);
    }
    static int robHelper(int[] nums, int[] dp, int idx) {
        if (idx == 0) {
            return dp[0];
        }
        if (idx == 1) {
            return dp[1];
        }
        if (dp[idx] != -1) {
            return dp[idx];
        }
        int s1 = nums[idx] + robHelper(nums, dp, idx - 2);
        int s2 = robHelper(nums, dp, idx - 1);
        dp[idx] = Math.max(s1, s2);
        return dp[idx];
    }
    // House Robber 2
    static int rob2(int[] nums) {
        int s1 = robCircular(Arrays.copyOfRange(nums, 0, nums.length - 1));
        int s2 = robCircular(Arrays.copyOfRange(nums, 1, nums.length));

        return Math.max(s1, s2);
    }

    // Alternate dp Approach
    static int robCircular(int[] nums) {
        if (nums.length < 2) {
            return nums[0];
        }
        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[nums.length - 1];
    }

    public static void main(String[] args) {
        System.out.println(rob2(new int[]{2, 7, 3, 8, 4, 2, 1, 8}));
    }
}
