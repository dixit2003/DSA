package Recursions;

public class ReverseANum {
    static int reverseNumber(int n) {
        if (n == 0)
            return 0;
        return (int) (((n % 10) * Math.pow(10, Integer.toString(n).length() - 1)) + reverseNumber(n / 10));
    }
    static boolean isPalindrome(int n){
        return n == reverseNumber(n);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1432741));

    }
}
