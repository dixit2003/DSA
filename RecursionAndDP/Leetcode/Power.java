package Recursions.Leetcode;

public class Power {
    static double power(double x, int n) {
        if (n >= 0) {
            return calcPower(x, n);
        }
        else {
            return 1 / calcPower(x, Math.abs(n));
        }
    }
    static double calcPower(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }

        double pow = calcPower(x, n / 2);
        if (n % 2 == 0) {
            return pow * pow;
        } else {
            return pow * pow * x;
        }
    }

    public static void main(String[] args) {
        double pow = power(2.000000, 10);
        System.out.println(pow);
    }
}
