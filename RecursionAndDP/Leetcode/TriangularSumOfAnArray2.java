package Recursions.Leetcode;

import java.util.Arrays;

public class TriangularSumOfAnArray2 {
    static int[][] triangularSum2(int[] arr) {
        if (arr.length == 1) {
            return new int[][]{{arr[0]}};
        }
        int[][] ans = new int[arr.length][];
        ans[ans.length - 1] = arr;

        return helper(ans, arr.length - 1);
    }
    private static int[][] helper(int[][] ans, int n) {
        if (n == 0) {
            return ans;
        }
        int[] temp = new int[ans[ans.length - 1].length - 1];

        for (int i = 0; i < n - 1; i++) {
            temp[i] = ans[ans.length - 1][i] + ans[ans.length - 1][i + 1];
        }
        ans[n - 1] = temp;

        return helper(ans, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(triangularSum2(new int[]{1, 2, 3, 4, 5})));
    }
}
