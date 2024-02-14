package BitManipulation;

import java.util.*;

public class SortIntegersByTheNumberOf1Bits {
    static int[] sortByBits(int[] arr) {
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            ans[i] = count(arr[i]);
        }
        Arrays.sort(ans);
        return ans;
    }
    static int count(int n) {
        int res = 0;

        while (n != 0) {
            res += (n & 1);
            n = n >> 1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println();
    }
 }
