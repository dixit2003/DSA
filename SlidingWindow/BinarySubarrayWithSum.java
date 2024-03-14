package SlidingWindow;

public class BinarySubarrayWithSum {
    static int numSubarraysWithSum(int[] nums, int goal) {
        int sum = 0;
        int ans = 0;
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == goal) {
                ans++;
            }
            else if (sum > goal) {
                while (sum >= goal && j < nums.length) {
                    sum -= nums[j++];
                    if (sum == goal) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(numSubarraysWithSum(new int[]{0, 1, 1, 0, 0, 1, 0, 1, 1}, 5));
    }
}
