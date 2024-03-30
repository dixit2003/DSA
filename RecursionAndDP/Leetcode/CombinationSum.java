package RecursionAndDP.Leetcode;

import java.util.*;

public class CombinationSum {
    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);

        return generateCombos(candidates, target, 0, new ArrayList<>());

    }
    static List<List<Integer>> generateCombos(int[] candidates, int remain, int start, List<Integer> temp) {
        if(remain == 0) {
            List<List<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>(temp));
            return list;
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = start; i < candidates.length; i++) {
            if (remain - candidates[i] >= 0) {
                temp.add(candidates[i]);
                ans.addAll(generateCombos(candidates, remain - candidates[i], i, temp));
                temp.remove(temp.size() - 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2, 4, 6, 8}, 8));
    }
}