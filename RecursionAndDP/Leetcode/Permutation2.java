package RecursionAndDP.Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;

public class Permutation2 {
    static List<List<Integer>> permutations2(int[] arr) {
        Arrays.sort(arr);
        List<Integer> set = new ArrayList<>();
        for (int j : arr) {
            set.add(j);
        }
        return permutationsHelper(set, 0);
    }
    static List<List<Integer>> permutationsHelper(List<Integer> list, int j) {
        if (j == list.size()) {
            List<List<Integer>> temp = new ArrayList<>();
            temp.add(new ArrayList<>(list));
            return temp;
        }
        List<List<Integer>> ans = new ArrayList<>();

        Set<Integer> s = new HashSet<>();
        for (int i = j; i < list.size(); i++) {
            if (i > j && list.get(i).equals(list.get(i - 1)))
                continue;
            swap(list, i, j);
            ans.addAll(permutationsHelper(list, j + 1));
            swap(list, i, j);
            s.add(list.get(i));
        }
        return ans;
    }
    static void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public static void main(String[] args) {
        System.out.println(permutations2(new int[]{3, 3, 0, 3}));
    }
}
