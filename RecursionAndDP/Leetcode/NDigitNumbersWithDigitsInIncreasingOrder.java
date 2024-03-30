package Recursions.Leetcode;

import java.util.ArrayList;

public class NDigitNumbersWithDigitsInIncreasingOrder {
    static ArrayList<Integer> increasingNumbers(int n) {
        return helper(0, n, new ArrayList<>(), 1);
    }

    private static ArrayList<Integer> helper(int current, int n, ArrayList<Integer> list, int startDigit) {
        if (n == 0) {
            list.add(current);
            return list;
        }

        for (int i = startDigit; i <= 9; i++) {
            int newNumber = current * 10 + i;
            helper(newNumber, n - 1, list, i + 1);
        }

        return list;
    }

    public static void main(String[] args) {
        System.out.println(increasingNumbers(1));
    }
}
