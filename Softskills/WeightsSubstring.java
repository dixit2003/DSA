package Softskills;

import java.util.ArrayList;
import java.util.List;

public class WeightsSubstring {
    static String shortestWeightedString(int weight) {
        List<Integer> list = new ArrayList<>();
        list.add(1);

        int k = weight;
        StringBuilder result = new StringBuilder();

        for (int i = 1; i < 25; i++) {
            int ele = (i + 1) * list.get(i - 1) + list.get(i - 1);

            if (ele <= weight) {
                list.add(ele);
            } else {
                break;
            }
        }
        while (k != 0) {
            int index = findIndex(list, k);
            char ch = (char) ('A' + index);
            result.insert(0, ch);
            k -= list.get(index);
        }
        return result.toString();
    }

    private static int findIndex(List<Integer> list, int k) {
        int start = 0;
        int end = list.size() - 1;

        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (list.get(mid) <= k) {
                ans = mid;
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(shortestWeightedString(16));

    }
}
