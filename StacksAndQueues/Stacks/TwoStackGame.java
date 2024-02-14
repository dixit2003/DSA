package StacksAndQueues.Stacks;

import java.util.Arrays;
import java.util.Stack;

public class TwoStackGame {
    static int game(int[] a, int[] b, int maxSum) {
        return game(a, b, maxSum, 0, 0);
    }
    static int game(int[] first, int[] second, int sum, int varSum, int count) {
        if (varSum > sum) {
            return count - 1;
        }
        if (first.length == 0 || second.length == 0)
            return count;

        int leftCount = game(Arrays.copyOfRange(first,1, first.length), second, sum, varSum + first[0], count + 1);
        int rightCount = game(first, Arrays.copyOfRange(second,1, second.length), sum, varSum + second[0], count + 1);

        return Math.max(leftCount, rightCount);
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 5, 2, 3};
        int[] b = {1, 2, 5, 4, 3};

        System.out.println(game(a, b, 15));
    }

}
