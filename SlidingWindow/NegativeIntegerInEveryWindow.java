package SlidingWindow;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NegativeIntegerInEveryWindow {
    static int[] printFirstNegativeInteger(int[] arr, int n, int k) {
        int i = 0;
        int j = 0;
        int idx = 0;

        int[] ans = new int[n - k + 1];

        Deque<Integer> q = new ArrayDeque<>();

        while (j < n) {
            if (arr[j] < 0) {
                q.addLast(j);
            }
            if (j - i + 1 == k) {
                if (!q.isEmpty()) {
                    ans[idx] = arr[q.peekFirst()];
                }
                idx++;
                i++;
                if (!q.isEmpty() && q.peekFirst() < i) {
                    q.pollFirst();
                }
            }
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(printFirstNegativeInteger(new int[]{5, -3, 2, 3, -4}, 5, 2)));
    }
}
