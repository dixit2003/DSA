package Arrays;

import java.util.*;

public class LeastNumberofUniqueIntegersAfterKRemovals {
    static int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.values());

        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            if (k > list.get(i)) {
                k -= list.get(i);
                list.set(i, 0);
            }
            else {
                list.set(i, list.get(i) - k);
                k = 0;
            }
            if (list.get(i) != 0) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findLeastNumOfUniqueInts(new int[]{4,3,1,1,3,3,2}, 3)  );
    }
}
