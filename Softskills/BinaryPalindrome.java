package Softskills;

public class BinaryPalindrome {
    static boolean isPalindrome(int n) {
        int copy = n;
        int rev = 0;

        while (copy > 0) {
            rev = rev << 1 | copy & 1;
            copy = copy >> 1;
        }
        return n == rev;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(9));
    }
}
