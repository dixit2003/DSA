package Arrays;

import java.util.*;

public class SpiralMatrix1 {
    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return list;
        }
        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;

        int count = matrix.length * matrix[0].length;
        int n = 0;

        while (n < count) {
            // Traverse Right
            for (int i = colStart; i <= colEnd; i++) {
                list.add(matrix[rowStart][i]);
                n++;
            }
            rowStart++;
            if (n >= count) {
                break;
            }
            // Traverse Down
            for (int i = rowStart; i <= rowEnd; i++) {
                list.add(matrix[i][colEnd]);
                n++;
            }
            colEnd--;
            if (n >= count) {
                break;
            }
            // Traverse Left
            for (int i = colEnd; i >= colStart; i--) {
                list.add(matrix[rowEnd][i]);
                n++;
            }
            rowEnd--;
            if (n >= count) {
                break;
            }
            //Traverse Up
            for (int i = rowEnd; i >= rowStart; i--) {
                list.add(matrix[i][colStart]);
                n++;
            }
            colStart++;
            if (n >= count) {
                break;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}, {17,18,19,20}};
        System.out.println(spiralOrder(arr));
    }
}