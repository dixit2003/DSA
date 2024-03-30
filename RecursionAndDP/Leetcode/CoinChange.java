package Recursions.Leetcode;
import java.util.Arrays;

public class CoinChange {
    static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);
        int ans = coinChangeHelper(coins, amount, dp);
        return (ans == Integer.MAX_VALUE) ?  -1 : ans;
    }

    static int coinChangeHelper(int[] coins, int remainingAmount, int[] dp) {
        if (remainingAmount == 0) {
            return 0;
        } else if (remainingAmount < 0) {
            return Integer.MAX_VALUE;
        }
        if (dp[remainingAmount] != -1) {
            return dp[remainingAmount];
        }

        int steps = Integer.MAX_VALUE;

        for (int coin : coins) {
            int ans = 1 + coinChangeHelper(coins, remainingAmount - coin, dp);

            if (ans != Integer.MAX_VALUE) {
                steps = Math.min(steps, ans);
            }
        }
        dp[remainingAmount] = steps;
        return steps;
    }

    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1, 2, 5}, 11));
    }
}
