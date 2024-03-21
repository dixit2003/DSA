package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class BinarySubarrayWithSum {
    static int numSubarraysWithSum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int ele: nums) {
            prefixSum += ele;
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }
            if (map.containsKey(prefixSum)) {
                map.replace(prefixSum, map.get(prefixSum) + 1);
            } else {
                map.put(prefixSum, 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numSubarraysWithSum(new int[]{0, 1, 1, 0, 0, 1, 0, 1, 1}, 3));
    }
}
