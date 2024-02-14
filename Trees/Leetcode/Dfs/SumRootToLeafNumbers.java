package Trees.Leetcode.Dfs;

import Trees.TreeNode;

public class SumRootToLeafNumbers {
    static int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }
    static int helper(TreeNode root, int sum) {
        if (root == null)
            return 0;

        sum = sum * 10 + root.val;

        if (root.left == null && root.right == null)
            return sum;

        return helper(root.left, sum) + helper(root.right, sum);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(9);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(1);

        // Calculating the sum of numbers formed by root-to-leaf paths
        System.out.println(sumNumbers(root));

    }
}
