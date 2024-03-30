package RecursionAndDP.Leetcode;

import java.util.*;
public class Permutation {
    static List<List<Integer>> permutations(int[] arr) {
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
            swap(list, i, j);
            ans.addAll(permutationsHelper(list, j + 1));
            swap(list, i, j);
        }
        return ans;
    }
    static void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public static void main(String[] args) {
        System.out.println(permutations(new int[]{1, 2, 3}));
    }
}
