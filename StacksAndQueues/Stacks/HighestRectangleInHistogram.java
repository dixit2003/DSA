package StacksAndQueues.Stacks;

import java.util.Stack;

public class HighestRectangleInHistogram {
    static int getMax(int[] heights, Stack<Integer> stack, int max, int i) {
        int ans = -1;
        int popped = stack.pop();

        if (stack.empty()) {
            ans = heights[popped] * i;
        } else {
            ans = heights[popped] * (i - 1 - stack.peek());
        }
        return Math.max(max, ans);
    }
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int max = 0;

        for (int i = 1; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                max = getMax(heights, stack, max, i);
            }
            stack.push(i);
        }
        int i = heights.length;

        while (!stack.isEmpty()) {
            max = getMax(heights, stack, max, i);
        }
        return max;

    }
    public static void main(String[] args) {
        int[] heights = {2,4};
        System.out.println(largestRectangleArea(heights));
    }
}
