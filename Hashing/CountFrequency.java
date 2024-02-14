package Hashing;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    static void frequencies(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int element = entry.getKey();
            int frequency = entry.getValue();
            System.out.println("Frequency of " + element + ": " + frequency);
        }
    }

    public static void main(String[] args) {
        frequencies(new int[]{1, 2, 1, 3, 2});
    }
}
