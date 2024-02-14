package SlidingWindow;

public class SubarrayProductLessThanK {
    static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k == 0 || k == 1) {
            return 0;
        }
        int i = 0;
        int j = 0;

        int prod = 1;
        int count = 0;

        while (j < nums.length) {
            prod *= nums[j];
            while (prod >= k) {
                prod /= nums[i];
                i++;
            }
            count += j - i + 1;
            j++;

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numSubarrayProductLessThanK(new int[]{3, 7, 2, 1, 8, 4, 5}, 40));
    }
}
