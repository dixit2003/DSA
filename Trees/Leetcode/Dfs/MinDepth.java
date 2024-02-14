package Trees.Leetcode.Dfs;

import Trees.TreeNode;

public class MinDepth {
    static int minDepth(TreeNode root) {
        if (root == null)
            return 0;

        // If either left or right subtree is null, return the depth of the non-null subtree
        if (root.left == null)
            return minDepth(root.right) + 1;
        if (root.right == null)
            return minDepth(root.left) + 1;

        // Return the minimum depth between left and right subtrees, plus 1 for the current node
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(minDepth(root));
    }

}
