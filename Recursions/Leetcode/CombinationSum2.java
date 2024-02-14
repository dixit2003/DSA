package Recursions.Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class CombinationSum2 {
    static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
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
                ans.addAll(generateCombos(candidates, remain - candidates[i], i + 1, temp));
                temp.remove(temp.size() - 1);
            }
            while(i<candidates.length - 1 && candidates[i] == candidates[i + 1]){
                i++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(combinationSum2(new int[]{10,1,2,7,6,1,5}, 8));
    }
}
