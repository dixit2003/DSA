package Patterns;

public class Ptrn8 {
    static void pattern(int n) {
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int valAtIndex = n - Math.min(Math.min(col, row), Math.min(n - col, n - row));
                System.out.print(valAtIndex + " ");
            }
            System.out.println( );
        }
    }

    public static void main(String[] args) {
        pattern(2);
    }
}
