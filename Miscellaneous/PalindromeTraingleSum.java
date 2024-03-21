package Miscellaneous;

public class PalindromeTraingleSum {
    // Method: 1 Using Recursion
    static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return (n * (n + 1)) - 1 + sum(n - 1);
    }
    //Method: 2 Using Iteration
    static int sum2(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (i * (i + 1)) - 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum2(5));
    }
}
