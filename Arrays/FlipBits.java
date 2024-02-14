package Arrays;

public class FlipBits {
    static int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int maxOnes = 0;

        while (right < nums.length) {
            if (nums[right] == 0) {
                k--;
            }

            while (k < 0) {
                if (nums[left] == 0) {
                    k++;
                }
                left++;
            }
            maxOnes = Math.max(maxOnes, right - left + 1);

            right++;
        }

        return maxOnes;
    }

    public static void main(String[] args) {
        System.out.println(longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3));
    }
}
