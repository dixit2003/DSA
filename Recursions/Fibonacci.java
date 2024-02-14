package Recursions;

public class Fibonacci {
    static void fibo(int a, int b, int n) {
        if (n == 10)
            return;
        int c = b + a;
        System.out.print(c + " ");
        fibo(b, c, n + 1);
    }
    //To get nth fibonacci element, change the data type, and return 'c' at the end, or else use Fibo(n) = Fibo(n - 1) + Fibo(n - 2)
    static int fibo(int n) {
        if (n < 2)
            return n;
        return fibo(n - 1) + fibo(n - 2);

    }

    public static void main(String[] args) {
//        System.out.print(0 + " ");
//        System.out.print(1 + " ");
//        fibo(0, 1, 0);
        System.out.println(fibo(7));

    }
}
