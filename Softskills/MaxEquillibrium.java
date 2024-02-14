package Softskills;

import java.util.Arrays;

public class MaxEquillibrium {
    static int maxEquillibriumValue(int[] arr) {
        int ss = Arrays.stream(arr).sum();
        int max = Integer.MIN_VALUE;
        int pre = 0;

        for (int i : arr) {
            pre += i;
            if (pre == ss) {
                max = Math.max(max, pre);
            }
            ss -= i;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxEquillibriumValue(new int[]{-2, 5, 3, 1, 2, 6, -4, 2}));

    }
}
