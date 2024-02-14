package Basics;

public class Prime {
    static boolean isPrime(int n){
        if (n <= 1)
            return false;
        int c = 2;
        while (c  <= n / 2){
            if (n % c == 0)
                return false;
            c++;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(71));

    }
}
