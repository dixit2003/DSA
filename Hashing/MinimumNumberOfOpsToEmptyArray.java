package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class MinimumNumberOfOpsToEmptyArray {
    static int minOperations(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        int ans = 0;

        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int frequency = entry.getValue();
            if (frequency == 1) {
                return -1;
            }
            ans += frequency / 3;
            ans += (frequency % 3 > 0) ? 1 : 0;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{2,3,3,2,2,4,2,3,4}));

        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(5);
        int[] arr = {3, 4, 5, 7, 8, 8, 9};
    }
}
