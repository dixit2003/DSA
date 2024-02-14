package Trees.Leetcode.Dfs;

import Trees.TreeNode;

public class MaximumDifferenceBetweenNodeAndAncestor {
    static int maxAncestorDiff(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return maxAncestorDiffHelper(root, root.val, root.val);
    }
    static int maxAncestorDiffHelper(TreeNode root, int min, int max) {
        if (root == null) {
            return Math.abs(max - min);
        }
        max = Math.max(max, root.val);
        min = Math.min(min, root.val);
        int left = maxAncestorDiffHelper(root.left, min, max);
        int right = maxAncestorDiffHelper(root.right, min, max);

        return Math.max(left, right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);
        root.left.right.left = new TreeNode(4);
        root.left.right.right = new TreeNode(7);
        root.right.right = new TreeNode(14);
        root.right.right.left = new TreeNode(13);

        System.out.println(maxAncestorDiff(root));
    }
}
