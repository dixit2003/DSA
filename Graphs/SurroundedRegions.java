package Graphs;

import java.util.Arrays;

public class SurroundedRegions {
    static void solve(char[][] board) {
        boolean[][] vis = new boolean[board.length][board[0].length];
        int r = board.length - 1;
        int c = board[0].length - 1;

        // Traverse 1st row
        for (int i = 0; i < board[0].length; i++) {
            if (board[0][i] != 'X') {
                helper(board, vis, 0, i);
            }
        }
        // Traverse 1st column
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] != 'X') {
                helper(board, vis, i, 0);
            }
        }
        // Traverse last row
        for (int i = 0; i < board[0].length; i++) {
            if (board[r][i] != 'X') {
                helper(board, vis, r, i);
            }
        }
        // Traverse last column
        for (int i = 0; i < board.length; i++) {
            if (board[i][c] != 'X') {
                helper(board, vis, i, c);
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (!vis[i][j]) {
                    board[i][j] = 'X';
                }
            }
        }

    }
    static void helper(char[][] board, boolean[][] vis, int i, int j) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] == 'X' || vis[i][j]) {
            return;
        }
        if (board[i][j] == 'O') {
            vis[i][j] = true;
            // Check North
            helper(board, vis, i - 1, j);
            // Check South
            helper(board, vis, i + 1, j);
            // Check East
            helper(board, vis, i, j - 1);
            // Check West
            helper(board, vis, i, j + 1);
        }
    }

    public static void main(String[] args) {
        char[][] board = {{'O', 'X', 'X', 'O', 'X'},
                          {'X', 'O', 'O', 'X', 'O'},
                          {'X', 'O', 'X', 'O', 'X'},
                          {'O', 'X', 'O', 'O', 'O'},
                          {'X', 'X', 'O', 'X', 'O'}};
        solve(board);
        System.out.println(Arrays.deepToString(board));
    }
}
