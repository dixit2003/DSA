package SlidingWindow;

import java.util.ArrayDeque;
import java.util.Deque;

public class ShortestSubarraywithSumAtLeastK {
    static int shortestSubarray(int[] nums, int k) {
        int nlen = nums.length;
        int ans = nlen + 1;

        long[] arr = new long[nlen + 1];
        for (int i = 0; i < nlen; i++) {
            arr[i + 1] = nums[i] + arr[i];
        }

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {
            while (!dq.isEmpty() && arr[i] - arr[dq.peek()] >= k){
                ans = Math.min(ans, i - dq.poll());
            }

            while (!dq.isEmpty() && arr[i] <= arr[dq.peekLast()]) {
                dq.pollLast();
            }

            dq.add(i);
        }

        return ans <= nlen ? ans : -1;
    }
    public static void main(String[] args) {
        System.out.println(shortestSubarray(new int[]{48, 99, 37, 4, -31}, 140));
    }
}
