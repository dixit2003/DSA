package Arrays;

import java.util.Arrays;

public class BuyAndSellStock2 {
    // Buy and sell stock - II      Method-1:
    static int maxProfit21(int[] arr) {
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;

        for (int price: arr) {
            if (price >= minPrice) {
                profit += price - minPrice;
            }
            minPrice = price;
        }
        return profit;
    }
    // Buy and sell stock - II      Method-2:
    static int maxProfit22(int[] arr) {
        int[][] dp = new int[arr.length][2];
        for (int[] a: dp) {
            Arrays.fill(a, -1);
        }
        return maxProfit22Helper(arr, 0, 1, dp);

    }
    static int maxProfit22Helper(int[] arr, int idx, int buy, int[][] dp) {
        if (idx == arr.length) {
            return 0;
        }
        long profit;
        if (dp[idx][buy] != -1) {
            return dp[idx][buy];
        }
        if (buy == 1) {
            profit = Math.max(-arr[idx] + maxProfit22Helper(arr, idx + 1, 0, dp), maxProfit22Helper(arr, idx + 1, 1, dp));
        }
        else {
            profit = Math.max(arr[idx] + maxProfit22Helper(arr, idx + 1, 1, dp), maxProfit22Helper(arr, idx + 1, 0, dp));
        }
        return dp[idx][buy] = (int) profit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit22(new int[]{7, 1, 5, 3, 6, 4}));
    }

}
