package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    static boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = 0;
        int j = 0;
        Set<Integer> set = new HashSet<>();

        while (j < nums.length) {
            if (Math.abs(i - j) > k) {
                set.remove(nums[i]);
                i++;
            }
            if (set.contains(nums[j])) {
                return true;
            }
            set.add(nums[j]);
            j++;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1,0,1,1}, 1));
    }
}
