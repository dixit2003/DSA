package Arrays;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumberInAMatrix {
    static List<Integer> luckyNumber(int[][] arr) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int rowMin = Integer.MAX_VALUE;
            int minIndex = 0;

            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < rowMin) {
                    rowMin = arr[i][j];
                    minIndex = j;
                }
            }
            boolean isTrue = true;

            for (int k = 0; k < arr.length; k++) {
                if(arr[i][minIndex] < arr[k][minIndex]) {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue)
                ans.add(arr[i][minIndex]);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(luckyNumber(new int[][]{{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}}));
    }
}
