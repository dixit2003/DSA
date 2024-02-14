package StacksAndQueues.Queues;

import java.util.*;

public class SnakesLadders {
    static int snakesAndLadders(int[][] board) {
        int n = board.length;
        int steps = 0;
        Queue<Integer> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
        queue.offer(1); // Start at square 1
        visited[n - 1][0] = true;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                int currentSquare = queue.poll();
                if (currentSquare == n * n) return steps; // Reached the destination

                for (int k = 1; k <= 6; k++) {
                    int nextSquare = currentSquare + k;
                    if (nextSquare > n * n) break; // No need to consider squares beyond the board

                    int[] coordinates = findCoordinates(nextSquare, n);
                    int row = coordinates[0];
                    int col = coordinates[1];

                    if (visited[row][col]) continue; // Already visited
                    visited[row][col] = true;

                    int nextValue = board[row][col] == -1 ? nextSquare : board[row][col];
                    queue.offer(nextValue);
                }
            }

            steps++;
        }

        return -1; // If we can't reach the destination
    }
    static int[] findCoordinates(int current, int n) {
        int row = n - 1 - (current - 1) / n;
        int col = (current - 1) % n;
        if (row % 2 == n % 2) {
            col = n - 1 - col;
        }
        return new int[]{row, col};
    }

    public static void main(String[] args) {
        int[][] arr = {{-1,-1,-1,-1,-1,-1}, {-1,-1,-1,-1,-1,-1}, {-1,-1,-1,-1,-1,-1}, {-1,35,-1,-1,13,-1}, {-1,-1,-1,-1,-1,-1}, {-1,15,-1,-1,-1,-1}};

        System.out.println(snakesAndLadders(arr));

    }
}
