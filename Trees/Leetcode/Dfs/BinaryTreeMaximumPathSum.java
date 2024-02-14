package Trees.Leetcode.Dfs;

import Trees.TreeNode;

public class BinaryTreeMaximumPathSum {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }
    int helper(TreeNode root) {
        if (root == null)
            return 0;

        int leftSum = helper(root.left);
        int rightSum = helper(root.right);

        leftSum = Math.max(0, leftSum);
        rightSum = Math.max(0, rightSum);

        int sum = leftSum + rightSum + root.val;

        max = Math.max(sum, max);
        return Math.max(leftSum, rightSum) + root.val;
    }
}
