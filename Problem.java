public class Problem {
    static int uniquePathsWithObstacles(int[][] grid) {
        return helper(0, 0, grid);
    }

    static int helper(int row, int col, int[][] grid) {
        // If the current cell is an obstacle, no path exists
        if (grid[row][col] == 1) {
            return 0;
        }

        // If reached the bottom-right cell, return 1 as a valid path is found
        if (row == grid.length - 1 && col == grid[0].length - 1) {
            return 1;
        }

        int right = 0, down = 0;

        // Move right if within the bounds
        if (col < grid[0].length - 1) {
            right = helper(row, col + 1, grid);
        }

        // Move down if within the bounds
        if (row < grid.length - 1) {
            down = helper(row + 1, col, grid);
        }

        // Return the sum of paths from right and down
        return right + down;
    }

    public static void main(String[] args) {
        System.out.println(uniquePathsWithObstacles(new int[][]{{0,0,0}, {0,1,0}, {0,0,0}}));
    }
}
