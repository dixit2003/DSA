package Recursions;

public class Recursions {
    static void printNum(int n) {
        if (n < 1)
            return;
        System.out.println(n);
        printNum(n - 1);
    }
    static int factorial(int n) {
        if (n <= 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        //printNum(7);
        System.out.println(factorial(5));
    }
}
