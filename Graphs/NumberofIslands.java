package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class NumberofIslands {
    // Using BFS
    static int numIslands(char[][] grid) {
        int ans = 0;
        boolean[][] vis = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!vis[i][j] && grid[i][j] == '1') {
                    numIslandsHelper(grid, vis, i, j);
                    ans++;
                }
            }
        }
        return ans;
    }
    static void numIslandsHelper(char[][] grid, boolean[][] vis, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || vis[i][j]) {
            return;
        }
        if (grid[i][j] == '1') {
            vis[i][j] = true;
        }
        if (j + 1 < grid[0].length && grid[i][j + 1] == '1' && !vis[i][j + 1]) {
            numIslandsHelper(grid, vis, i, j + 1);
        }
        if (i - 1 >= 0 && grid[i - 1][j] == '1' && !vis[i - 1][j]) {
            numIslandsHelper(grid, vis, i - 1, j);
        }
        if (j - 1 >= 0 && grid[i][j - 1] == '1' && !vis[i][j - 1]) {
            numIslandsHelper(grid, vis, i, j - 1);
        }
        if (i + 1 < grid.length && grid[i + 1][j] == '1' && !vis[i + 1][j]) {
             numIslandsHelper(grid, vis, i + 1, j);
        }
    }

    public static void main(String[] args) {
        char[][] board = {{'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};

        System.out.println(numIslands(board));
    }
}
