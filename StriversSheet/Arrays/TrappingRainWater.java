package StriversSheet.Arrays;

import LinkedList.Singly.MergeSort;

import java.util.Arrays;

public class TrappingRainWater {

    // TC: O(n)      SC: O(n)
    static int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < height.length; i++) {
            max = Math.max(max, height[i]);
            left[i] = max;
        }
        max = Integer.MIN_VALUE;
        for (int i = height.length - 1; i >= 0; i--) {
            max = Math.max(max, height[i]);
            right[i] = max;
        }
        int maxTrapped = 0;
        for (int i = 0; i < height.length; i++) {
            maxTrapped += Math.min(left[i], right[i]) - height[i];
        }
        return maxTrapped;
    }

    // TC: O(n)      SC: O(1)
    static int trap2(int[] heights) {
        int leftMax = Integer.MIN_VALUE;
        int rightMax = Integer.MIN_VALUE;

        int s = 0;
        int e = heights.length - 1;

        int maxTrapped = 0;

        while (s <= e) {
            leftMax = Math.max(leftMax, heights[s]);
            rightMax = Math.max(rightMax, heights[e]);

            maxTrapped += (leftMax <= rightMax) ? leftMax - heights[s++] : rightMax - heights[e--];
        }
        return maxTrapped;
    }

    public static void main(String[] args) {
        System.out.println(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
        System.out.println(trap2(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}
