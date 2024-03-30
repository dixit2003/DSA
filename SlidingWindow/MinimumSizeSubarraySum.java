package SlidingWindow;

public class MinimumSizeSubarraySum {
    static int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;

        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        while (j < nums.length) {
            sum += nums[j];
            while (sum >= target) {
                minLength = Math.min(j - i + 1, minLength);
                sum -= nums[i++];
            }
            j++;
        }
        return minLength != Integer.MAX_VALUE ? minLength : 0;
    }

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(150, new int[]{10, -5, 200}));
    }
}
