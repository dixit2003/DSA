package Graphs;

import java.util.Arrays;

public class RottenOranges {
    static int orangesRotting(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    dfs(grid, i, j, 2);
                }
            }
        }
        int minutes = 2;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
                minutes = Math.max(minutes, grid[i][j]);
            }
        }
        return minutes - 2;
    }

    private static void dfs(int[][] grid, int i, int j, int minutes) {
        if (grid[i][j] == 0 ||(grid[i][j] > 1 && grid[i][j] < minutes)) {
            return;
        }
        grid[i][j] = minutes;
        if (i - 1 >= 0) dfs(grid, i - 1, j, minutes + 1);
        if (i + 1 < grid.length) dfs(grid, i + 1, j, minutes + 1);
        if (j - 1 >= 0) dfs(grid, i, j - 1, minutes + 1);
        if (j + 1 < grid[0].length) dfs(grid, i, j + 1, minutes + 1);
    }

    public static void main(String[] args) {
        System.out.println(orangesRotting(new int[][]{{2,1,1},{0,1,1},{1,0,1}}));
    }
}
