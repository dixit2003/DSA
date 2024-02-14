package Arrays;

import java.util.*;

public class FrequencyOfMostFrequentElement {
    static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        int l = 0;
        int r = 0;
        long total = 0;
        int ans = 0;


        while (r < nums.length) {
            total += nums[r];
            while ((long) nums[r] * (r - l + 1) > total + k) {
                total -= nums[l];
                l++;
            }
            ans = Math.max(ans, r - l + 1);
            r++;

        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(maxFrequency(new int[]{3, 6, 9}, 2));
    }
}
