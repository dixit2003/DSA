package StacksAndQueues.Stacks;

import java.util.Stack;
import java.util.Arrays;

public class CompetitiveSubSequence {
    static int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> stack = new Stack<>();
        int rem = nums.length - k;

        for (int ele: nums) {
            while (!stack.empty() && rem != 0 && ele < stack.peek()) {
                rem--;
                stack.pop();
            }
            stack.push(ele);
        }

        while (rem != 0) {
            stack.pop();
            rem--;
        }

        int[] ans = new int[k];

        for (int i = k - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mostCompetitive(new int[]{2,4,3,3,5,4,9,62}, 4)));
    }
}
