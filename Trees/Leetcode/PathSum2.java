package Trees.Leetcode;

import ObjectOrientedProgramming.Interfaces.A;
import Trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSum2 {
    static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        return pathSumHelper(root, targetSum, new ArrayList<>());
    }
    static List<List<Integer>> pathSumHelper(TreeNode root, int target, List<Integer> list) {
        if (root == null) {
            return new ArrayList<>();
        }
        if (root.left == null && root.right == null && target - root.val == 0) {
            list.add(root.val);
            List<List<Integer>> temp = new ArrayList<>();
            temp.add(new ArrayList<>(list));
            list.remove(list.size() - 1);
            return temp;
        }

        List<List<Integer>> ans = new ArrayList<>();
        list.add(root.val);
        ans.addAll(pathSumHelper(root.left, target - root.val, list));
        ans.addAll(pathSumHelper(root.right, target - root.val, list));
        list.remove(list.size() - 1);
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);

        System.out.println(pathSum(root, 22));

    }
}
