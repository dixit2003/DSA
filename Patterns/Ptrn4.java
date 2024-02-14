package Patterns;

public class Ptrn4 {
    static void pattern(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalCol = row > n ? n - (row - n) : row ;
            for (int col = 1; col <= totalCol; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pattern(6);
    }
}
