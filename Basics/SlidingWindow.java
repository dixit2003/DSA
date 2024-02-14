package Basics;

public class SlidingWindow {
    static int slidingWindow(int[] nums, int x) {
        int n = nums.length; // Number of elements in the array
        int minOperations = Integer.MAX_VALUE; // Minimum operations to achieve the target sum
        int currentSum = 0; // Current sum of elements
        int leftIndex = 0, rightIndex = 0; // Pointers for the sliding window

        while (rightIndex < n) {
            currentSum += nums[rightIndex];
            rightIndex++;

            while (currentSum > x && leftIndex < n) {
                currentSum -= nums[leftIndex];
                leftIndex++;
            }

            if (currentSum == x)
                minOperations = Math.min(minOperations, n - (rightIndex - leftIndex));
        }
        return minOperations;
    }
}
