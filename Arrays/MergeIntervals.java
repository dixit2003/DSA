package Arrays;

import java.util.*;
import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {
    static int[][] merge(int[][] arr) {
        if (arr.length == 1) {
            return arr;
        }
        Arrays.sort(arr, Comparator.comparingInt(i->i[0]));
        List<int[]> ans = new ArrayList<>();
        int[] newInterval = arr[0];
        ans.add(newInterval);

        for (int[] interval: arr) {
            if (interval[0] <= newInterval[1]) {
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            } else {
                newInterval = interval;
                ans.add(newInterval);
            }
        }
        return ans.toArray(new int[ans.size()][]);
        
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(merge(new int[][]{{1, 3}, {2, 8}, {8, 9}, {2, 4}, {10,15}})));
    }
}
