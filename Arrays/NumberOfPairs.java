package Arrays;

import java.util.Arrays;

public class NumberOfPairs {
    static long countPairs(int x[], int y[]) {
        int[] exceptionsArray = new int[5];

        for (int ele: y) {
            if (ele < 5)
                exceptionsArray[ele]++;
        }
        Arrays.sort(y);

        long totalPairs = 0;
        for (int j : x) {
            totalPairs += count(j, y, exceptionsArray);
        }
        return totalPairs;
    }
    static int count(int x, int[] y, int[] exceptionsArray) {
        if (x == 0)
            return 0;

        if (x == 1)
            return exceptionsArray[0];

        int ans;

        int idx = upperBound(y, x);

        if (idx < 0) {
            ans = 0;
        } else {
            ans = y.length - idx;
        }
        ans += exceptionsArray[0] + exceptionsArray[1];

        if (x == 2)
            ans -= exceptionsArray[3] + exceptionsArray[4];

        if (x == 3)
            ans += exceptionsArray[2];

        return ans;
    }
    static int upperBound(int[] arr, int n) {
        int idx = -1;

        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + ((e - s) / 2);

            if (arr[mid] <= n)
                s = mid + 1;
            else {
                e = mid - 1;
                idx = mid;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        System.out.println(countPairs(new int[]{2, 1, 6}, new int[]{1, 5}));
    }
}
