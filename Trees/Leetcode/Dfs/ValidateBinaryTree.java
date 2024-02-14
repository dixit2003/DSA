package Trees.Leetcode.Dfs;

import Trees.TreeNode;

public class ValidateBinaryTree {
    static boolean isValidBST(TreeNode root) {
        return helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    static boolean helper(TreeNode root, int min, int max) {
        if (root == null)
            return true;
        if (root.val >= max || root.val <= min)
            return false;

        return helper(root.left, min, root.val) && helper(root.right, root.val, max);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
//        root.left.left = new TreeNode(1);
//        root.left.right = new TreeNode(3);
//        root.right = new TreeNode(6);

        System.out.println(isValidBST(root));
    }
}
