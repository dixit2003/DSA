package Recursions.Leetcode;
import java.util.Arrays;
public class MinPathSum {
    static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        for (int i = 0; i < grid.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return minPathSumHelper(grid, m - 1, n - 1, dp);
    }
    static int minPathSumHelper(int[][] grid, int r, int c, int[][] dp) {
        if (r == 0 && c == 0) {
            return grid[0][0];
        }
        if (r < 0 || c < 0) {
            return 999;
        }

        if (dp[r][c] != -1) {
            return dp[r][c];
        }
        int up = grid[r][c] + minPathSumHelper(grid, r - 1, c, dp);
        int left = grid[r][c] + minPathSumHelper(grid, r, c - 1, dp);

        return dp[r][c] = Math.min(up, left);
    }

    public static void main(String[] args) {
        System.out.println(minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
    }
}
