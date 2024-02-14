package StacksAndQueues.Stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.Arrays;

public class NextGreaterElement1 {
    static int[] nextGreatest(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int n : nums2) {
            while (!stack.isEmpty() && stack.peek() < n) {
                map.put(stack.pop(), n);
            }

            stack.push(n);
        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.getOrDefault(nums1[i], -1);
        }

        return nums1;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreatest(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2})));

    }
}
