package Miscellaneous;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    static int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int currSum = 0;
        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i] == 1 ? 1 : -1;

            if (!map.containsKey(currSum)) {
                map.put(currSum, i);
            }
            else {
                maxLength = Math.max(i - map.get(currSum), maxLength);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(findMaxLength(new int[]{0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1}));
    }
}
