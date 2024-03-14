package Graphs;

public class NumberofEnclaves {
    static int numEnclaves(int[][] grid) {
        boolean[][] vis = new boolean[grid.length][grid[0].length];

        // Traverse 1st row
        for (int i = 0; i < grid[0].length; i++) {
            if (grid[0][i] == 1) {
                dfs(grid, vis, 0, i);
            }
        }
        // Traverse 1st column
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][0] == 1) {
                dfs(grid, vis, i, 0);
            }
        }
        // Traverse last row
        for (int i = 0; i < grid[0].length; i++) {
            if (grid[grid.length - 1][i] == 1) {
                dfs(grid, vis, grid.length - 1,  i);
            }
        }
        // Traverse last column
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][grid[0].length - 1] == 1) {
                dfs(grid, vis, i, grid[0].length - 1);
            }
        }
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (vis[i][j]) {
                    grid[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    count++;
                }
            }
        }
        return count;
    }
    private static void dfs(int[][] board, boolean[][] vis, int i, int j) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] == 0 || vis[i][j]) {
            return;
        }
        if (board[i][j] == 1) {
            vis[i][j] = true;
            // Check North
            dfs(board, vis, i - 1, j);
            // Check South
            dfs(board, vis, i + 1, j);
            // Check East
            dfs(board, vis, i, j - 1);
            // Check West
            dfs(board, vis, i, j + 1);
        }
    }

    public static void main(String[] args) {
        int[][] grid = {{0}, {1}, {1}, {0}, {0}};
        System.out.println(numEnclaves(grid));
    }
}
