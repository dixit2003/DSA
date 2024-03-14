package Graphs;

import ObjectOrientedProgramming.Interfaces.A;

import java.util.*;

public class NumberofDistinctIsland {
    static int countDistinctIslands(int[][] grid) {
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        Set<List<List<Integer>>> ans = new HashSet<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!vis[i][j] && grid[i][j] == 1) {
                    List<List<Integer>> list = new ArrayList<>();
                    dfs(grid, vis, i, j, list, i, j);
                    ans.add(list);
                }
            }
        }
        return ans.size();
    }
    static void dfs(int[][] grid, boolean[][] vis, int i, int j, List<List<Integer>> list, int b1, int b2) {
        if(vis[i][j]) {
            return;
        }
        vis[i][j] = true;
        List<Integer> temp = Arrays.asList(i - b1, j - b2);
        list.add(new ArrayList<>(temp));

        if (i - 1 >= 0 && grid[i - 1][j] == 1) {
            dfs(grid, vis, i - 1, j, list, b1, b2);
        }
        if (i + 1 < grid.length && grid[i + 1][j] == 1) {
            dfs(grid, vis, i + 1, j, list, b1, b2);
        }
        if (j - 1 >= 0 && grid[i][j - 1] == 1) {
            dfs(grid, vis, i, j - 1, list, b1, b2);
        }
        if (j + 1 < grid[0].length && grid[i][j + 1] == 1) {
            dfs(grid, vis, i, j + 1, list, b1, b2);
        }
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 1, 0, 1, 1},
                        {1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 1},
                        {1, 1, 0, 1, 1}};

        System.out.println(countDistinctIslands(grid));
    }
}
