package Arrays;

import java.util.Arrays;

public class CellsWithOddValues {
    static void oddCells(int m, int n, int[][] indices) {
        int[] rowMatrix = new int[m];
        int[] colMatrix = new int[n];

        for (int[] num: indices) {
            int row = num[0];
            int col = num[1];

            rowMatrix[row]++;
            colMatrix[col]++;
        }
        System.out.println(Arrays.toString(rowMatrix));
        System.out.println(Arrays.toString(colMatrix));
    }

    public static void main(String[] args) {
        oddCells(2, 3, new int[][]{{0, 1}, {1, 1}});
    }
}
