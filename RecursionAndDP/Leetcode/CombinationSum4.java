package RecursionAndDP.Leetcode;

import java.util.Arrays;

public class CombinationSum4 {
    static int combinationSum4(int[] nums, int target) {
        int[] dp = new int[1001];
        Arrays.fill(dp, -1);
        return combinationSum4Helper(nums, target, dp);
    }
    static int combinationSum4Helper(int[] nums, int target, int[] dp) {
        if (target == 0) {
            return 1;
        } else if (target < 0) {
            return 0;
        }
        int ans = 0;
        if (dp[target] != -1) {
            return dp[target];
        }

        for (int num : nums) {
            ans += combinationSum4Helper(nums, target - num, dp);
        }
        dp[target] = ans;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(combinationSum4(new int[]{9}, 3));
    }
}
