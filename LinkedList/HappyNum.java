package LinkedList;

public class HappyNum {
    static int numSquare(int n) {
        int sum = 0;
        for (int i = 0; i < String.valueOf(n).length(); i++) {
            int digit = n % 10;
            sum = sum + (digit * digit);
            n = n / 10;
        }
        return sum;
    }
    static boolean isHappy(int n) {
        int f = n;
        int s = n;
        do {
            s = numSquare(s);
            f = numSquare(numSquare(f));
        } while(f != s);
        if (s == 1)
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
}
