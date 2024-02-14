package SlidingWindow;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum {
    static int[] maxSlidingWindow(int[] nums, int k) {
        int i = 0;
        int j = 0;

        int[] ans = new int[nums.length - k + 1];
        int ansIndex = 0;

        Deque<Integer> q = new ArrayDeque<>();

        while (j < nums.length) {
            while (!q.isEmpty() && nums[q.peekLast()] < nums[j]) {
                q.pollLast();
            }
            q.addLast(j);
            if (!q.isEmpty() && q.peekFirst() < i) {
                q.pollFirst();
            }
            if (j - i + 1 == k) {
                ans[ansIndex] = nums[q.peekFirst()];
                ansIndex++;
                i++;
            }
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3)));
    }
}
