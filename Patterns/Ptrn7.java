package Patterns;

public class Ptrn7 {
    static void pattern(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalCol = row > n ? n - (row - n) : row;
            for (int s = 1; s <= n - totalCol; s++){
                System.out.print(" ");
            }

            for (int col = totalCol; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= totalCol; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
