package Patterns;

public class Ptrn2 {
    static  void pattern(int n) {
        for (int row = 5; row >= 1; row--) {
            for (int col = row; col >= 1; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
