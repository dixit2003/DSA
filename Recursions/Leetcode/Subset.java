package Recursions.Leetcode;

import java.util.*;

public class Subset {
    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, 0, ans, new ArrayList<>());
        return ans;
    }
    static void helper(int[] nums, int start, List<List<Integer>> ans, List<Integer> temp) {
        if (start == nums.length) {
            ans.add(new ArrayList<Integer>(temp));
            return;
        }
        temp.add(nums[start]);
        helper(nums, start + 1, ans, temp);
        temp.remove(temp.size() - 1);
        helper(nums, start + 1, ans, temp);
    }

    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1, 2, 3}));
    }
}
