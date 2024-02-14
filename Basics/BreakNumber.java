package Basics;

import java.util.Arrays;

public class BreakNumber {
    static int integerBreak(int n) {
        if (n == 2 || n == 3) {
            return n - 1;
        }
        int result = 1;
        while (n > 4) {
            result *= 3;
            n -= 3;
        }
        result *= n;
        return result;
    }


    public static void main(String[] args) {
//        System.out.println(integerBreak(10));
        String str = "luffy is still joyboy";

        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
    }
}
