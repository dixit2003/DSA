package StacksAndQueues.Queues;

import java.util.*;

public class MaxInWindow {
    static int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length -k + 1];
        int ansIndex = 0;
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            if (!q.isEmpty() && q.peek() == i - k) {
                q.poll();
            }
            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }
            q.offer(i);
            if (i >= k - 1) {
                ans[ansIndex++] = nums[q.peek()];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
    }
}
