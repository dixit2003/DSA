package Miscellaneous;

import java.util.*;

public class DecrementAndRearrange {
    static int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);

        if (arr[0] != 1)
            arr[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            if (!(Math.abs(arr[i] - arr[i - 1]) <= 1)) {
                arr[i] = arr[i - 1] + 1;
            }
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maximumElementAfterDecrementingAndRearranging(new int[]{1, 2, 3, 4, 5}));
    }
}
