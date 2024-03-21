package Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class MinArraows {
    static int findMinArrowShots(int[][] arr) {
        int minArrows = 0;
        Arrays.sort(arr, Comparator.comparingInt(i->i[0]));
        System.out.println(Arrays.deepToString(arr));
        int i = 1;
        int[] prev = arr[0];
        while (i < arr.length) {
            int currStart = arr[i][0];
            int currEnd = arr[i][1];
            if (currStart > prev[1]) {
                minArrows++;
                prev = arr[i];
            }
            else {
                prev[0] = Math.max(currStart, prev[0]);
                prev[1] = Math.min(currEnd, prev[1]);
            }
            i++;
        }
        return minArrows + 1;
    }

    public static void main(String[] args) {
        System.out.println(findMinArrowShots(new int[][]{{3,9},{7,12},{3,8},{6,8},{9,10},{2,9},{0,9},{3,9},{0,6},{2,8}}));
    }
}
