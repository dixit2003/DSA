package Arrays;

import java.util.Arrays;

public class GameOfLife {
    static void gameOfLife(int[][] board) {
        int[] dx = {0, 0, 1, 1, 1, -1, -1, -1};
        int[] dy = {1, -1, 1, -1, 0, 0, 1, -1};

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int count = 0;
                for (int k = 0; k < 8; k++) {
                    int row = i + dx[k];
                    int col = j + dy[k];
                    if (isValid(row, col, board)) {
                        if (Math.abs(board[row][col]) == 1) {
                            count++;
                        }
                    }
                }
                if (board[i][j] == 0 && count == 3) {
                    board[i][j] = 2;
                }
                if (board[i][j] == 1 && (count < 2 || count > 3) ){
                    board[i][j] = -1;
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == -1)
                    board[i][j] = 0;
                else if (board[i][j] == 2)
                    board[i][j] = 1;
            }
        }
    }
    static boolean isValid(int row, int col, int[][] board) {
        return ((row >= 0 && col >= 0) && (row < board.length && col < board.length));
    }

    public static void main(String[] args) {
        int[][] board = {{1, 1}, {1, 0}};
        gameOfLife(board);
        System.out.println(Arrays.deepToString(board));
    }
}
