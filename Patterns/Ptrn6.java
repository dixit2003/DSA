package Patterns;

public class Ptrn6 {
    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            int spaces = n - row;
            for (int s = 1; s <= spaces; s++){
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
