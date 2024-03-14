package Blind75;

public class MaximumSubarray {
    static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (currSum < 0) {
                currSum = 0;
            }
            currSum += nums[i];
            max = Math.max(max, currSum);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, -3, 4, -1, -2, 1, 5, -3}));
    }
}
