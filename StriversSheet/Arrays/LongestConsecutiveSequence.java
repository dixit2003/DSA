package StriversSheet.Arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    static int longestSequence(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int longest = 0;
        int count = 1;
        HashSet<Integer> set = new HashSet<>();
        for (int k : arr) {
            set.add(k);
        }
        for (int j : arr) {
            if (!set.contains(j - 1)) {
                int x = j;
                count = 1;
                while (set.contains(x + 1)) {
                    count++;
                    x += 1;
                }
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
    public static void main(String[] args) {
        System.out.println(longestSequence(new int[]{102, 4, 100, 1, 101, 3, 2, 1, 1}));

    }
}
