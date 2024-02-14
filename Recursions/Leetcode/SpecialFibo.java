package Recursions.Leetcode;

public class SpecialFibo {
    static int NthFibo(int n, int a, int b) {
        if (n == 1) {
            return a;
        }
        if (n == 2) {
            return b;
        }
        else {
            return NthFibo(n - 1, a, b) ^ NthFibo(n - 2, a, b);
        }
    }

    public static void main(String[] args) {
        System.out.println(NthFibo(15, 86, 77));
    }
}
