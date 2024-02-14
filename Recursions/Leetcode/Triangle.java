package Recursions.Leetcode;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Triangle {
    // Bottom up approach
    static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return minimumTotalHelper(triangle, 0, 0, dp);
    }
    static int minimumTotalHelper(List<List<Integer>> triangle, int i, int j, int[][] dp) {
        int n = triangle.size();
        if (i >= n || j >= n) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int x = minimumTotalHelper(triangle, i + 1, j, dp);
        int y = minimumTotalHelper(triangle, i + 1, j + 1, dp);
        return dp[i][j] = Math.min(x, y) + triangle.get(i).get(j);
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(2));
        list.add(Arrays.asList(3, 4));
        list.add(Arrays.asList(6, 5, 7));
        list.add(Arrays.asList(4, 1, 8, 3));
        System.out.println(minimumTotal(list));
    }
}
