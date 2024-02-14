package Trees.Leetcode.Dfs;

import Trees.TreeNode;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null && targetSum == 0)
            return false;

        return helper(root, targetSum);
    }

    public boolean helper(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null && targetSum == 0) {
            return true;
        }
        boolean left = hasPathSum(root.left, targetSum - root.val);
        boolean right = hasPathSum(root.right, targetSum - root.val);

        return left || right;
    }
    
}
