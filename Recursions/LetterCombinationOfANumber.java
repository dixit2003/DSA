package Recursions;

import java.util.ArrayList;

public class LetterCombinationOfANumber {
    static void solveSudoku(char[][] board) {

    }
    static boolean isSafe(int[][] board, int row, int col, int num) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][col] == num) {
                return false;
            }
        }
        for (int j = 0; j < board.length; j++) {
            if (board[j][col] == num) {
                return false;
            }
        }
        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num) {
                    return false;
                }
            }
        }
        return true;

    }


    public static void main(String[] args) {

    }
}
