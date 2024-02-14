package Patterns;

public class Ptrn5 {
    static void pattern(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalCol = row > n ? n - (row - n) : row;
            int spaces = n - totalCol;
            for (int s = 1; s <= spaces; s++){
                System.out.print(" ");
            }
            for (int col = 1; col <= totalCol; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pattern(5);
    }
}
