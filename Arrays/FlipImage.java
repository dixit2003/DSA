package Arrays;

import java.util.Arrays;

public class FlipImage {
    static int[][] flipAndInvertImage(int[][] A) {

        for (int i = 0; i < A.length; i++) {
            int low = 0;
            int high = A[i].length - 1;
            while (low <= high) {
                if (A[i][low] == A[i][high]) {
                    A[i][low] = 1 - A[i][low];
                    A[i][high] = A[i][low];

                }
                low++;
                high--;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(flipAndInvertImage(new int[][]{{1, 0, 0, 1}, {0, 1, 1, 0}, {1, 0, 1, 1}, {1, 1, 0, 0}})));
    }
}
