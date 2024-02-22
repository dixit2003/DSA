package Arrays;

import java.util.HashMap;

public class ContainsDuplicate2 {
    static boolean containsDuplicate(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                if (Math.abs(i - map.get(arr[i])) <= k) {
                    return true;
                }
            }
            map.put(arr[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,1,2,3}, 2));
    }
}
