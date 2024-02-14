package Arrays;

import java.util.*;

public class InsertInterval {
    static int[][] insert(int[][] intervals, int[] range) {
        List<int[]> result = new ArrayList<>();
        int i = 0;
        int n = intervals.length;

        // Add all intervals that come before the newInterval
        while (i < n && intervals[i][1] < range[0]) {
            result.add(intervals[i]);
            i++;
        }

        // Merge overlapping intervals with the newInterval
        while (i < n && intervals[i][0] <= range[1]) {
            range[0] = Math.min(range[0], intervals[i][0]);
            range[1] = Math.max(range[1], intervals[i][1]);
            i++;
        }
        result.add(range);

        // Add all intervals that come after the newInterval
        while (i < n) {
            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(insert(new int[][]{{1,2},{3,5},{6,7},{8,10},{12,16}}, new int[]{4,8})));
    }
}
