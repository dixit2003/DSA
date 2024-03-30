package RecursionAndDP.Leetcode;

public class WordSearch {
    static boolean exist(char[][] board, String word) {
        boolean[][] checkerBoard = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (solve(board, i, j, 0, word, checkerBoard)) {
                    return true;
                }
            }

        }
        return false;
    }
    static boolean solve(char[][] board, int i, int j, int idx, String word, boolean[][] checkBoard) {
        if (idx == word.length()) {
            return true;
        }
        if (i < 0 || j < 0 || i > board.length - 1 || j > board[0].length - 1) {
            return false;
        }
        if (checkBoard[i][j] || board[i][j] != word.charAt(idx)) {
            return false;
        }
        checkBoard[i][j] = true;

        if (solve(board, i + 1, j, idx + 1, word, checkBoard)) {
            return true;
        }
        if (solve(board, i - 1, j, idx + 1, word, checkBoard)) {
            return true;
        }
        if (solve(board, i, j + 1, idx + 1, word, checkBoard)) {
            return true;
        }
        if (solve(board, i, j - 1, idx + 1, word, checkBoard)) {
            return true;
        }
        checkBoard[i][j] = false;

        return false;


    }

    public static void main(String[] args) {
        System.out.println(exist(new char[][]{{'A', 'B', 'C', 'E'},{'S', 'F', 'C', 'S'},{'A', 'D', 'E', 'E'}}, "ABCCED"));
    }
}
