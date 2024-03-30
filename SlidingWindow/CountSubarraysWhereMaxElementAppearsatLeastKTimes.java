package SlidingWindow;

public class CountSubarraysWhereMaxElementAppearsatLeastKTimes {

    // Approach 1 using sliding window
    static long countSubarrays(int[] nums, int k) {
        int i = 0;
        int j = 0;

        int maxElement = Integer.MIN_VALUE;
        for (int num : nums) {
            maxElement = Math.max(maxElement, num);
        }

        int count = 0;

        long result = 0;

        while (j < nums.length) {
            if (nums[j] == maxElement) {
                count++;
            }

            while (count >= k) {
                result += nums.length - j;

                if (nums[i] == maxElement) {
                    count--;
                }
                i++;
            }
            j++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countSubarrays(new int[]{1, 3, 2, 2, 3}, 5));
    }
}
