package Recursions.Leetcode;

public class AddDigits {
    static int sumOfDigits(int n) {
        return helper(n, 0);
    }
    static int helper(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        sum += n % 10;
        return helper(n / 10, sum);
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(12345));
    }
}
