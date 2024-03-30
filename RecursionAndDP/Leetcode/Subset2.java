package RecursionAndDP.Leetcode;

import java.util.*;

public class Subset2 {
    static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
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

        while (start + 1 < nums.length && nums[start] == nums[start + 1]) {
            start += 1;
        }
        helper(nums, start + 1, ans, temp);
    }

    public static void main(String[] args) {
        System.out.println(subsetsWithDup(new int[]{1, 2, 2}));
    }
}
