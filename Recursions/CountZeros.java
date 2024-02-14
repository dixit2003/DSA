package Recursions;

public class CountZeros {
    static int zeroes(int n, int count){

        if (n == 0)
            return count;

        if (n % 10 == 0)
            return zeroes(n / 10, count + 1);
        else
            return zeroes(n / 10, count);
    }

    public static void main(String[] args) {
        System.out.println(zeroes(300061020, 0));
    }
}
