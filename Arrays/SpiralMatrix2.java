package Arrays;

import java.util.Arrays;

public class SpiralMatrix2 {
    static int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];

        int top = 0;
        int left = 0;
        int right = n - 1;
        int bottom = n - 1;

        int count = 1;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                ans[top][i] = count++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                ans[i][right] = count++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left  ; i--) { //Add elements to the list by traversing from right to left with bottom fixed
                    ans[bottom][i] = count++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top ; i--) { //Add elements to the list by traversing from bottom to top with left fixed
                    ans[i][left] = count++;
                }
                left++;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(4)));
    }
}
