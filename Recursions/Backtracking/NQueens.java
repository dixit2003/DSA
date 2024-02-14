package Recursions.Backtracking;

public class NQueens {
    static int queens(boolean[][] board, int r) {
        if (r == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        //Place the queen and check for every row and column
        for (int col = 0; col < board[0].length; col++) {
            //place the queen if the position is safe
            if (isSafe(board, r, col)){
                board[r][col] = true;
                count += queens(board, r + 1);
                board[r][col] = false;
            }
        }
        return count;
    }
    static void display(boolean[][] board) {
        for (boolean[] row: board) {
            for (boolean ele: row) {
                if (ele)
                    System.out.print("Q");
                else
                    System.out.print(".");
            }
            System.out.println();
        }
    }
    static boolean isSafe(boolean[][] board, int r, int col) {

        //Check vertical row
        for (int i = 0; i < r; i++) {
            if (board[i][col])
                return false;
        }
        //Diagonal left
        int maxLeft = Math.min(r, col);
        for (int j = 1; j <= maxLeft; j++) {
            if (board[r - j][col - j])
                return false;
        }
        //Diagonal right
        int maxRight = Math.min(r, board.length - 1 - col);
        for (int k = 1; k <= maxRight; k++) {
            if (board[r - k][col + k])
               return false;
        }
        return true;
    }



    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        System.out.println(queens(board,0));


    }
}
