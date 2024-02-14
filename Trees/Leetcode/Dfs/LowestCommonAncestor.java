package Trees.Leetcode.Dfs;

import Trees.TreeNode;

public class LowestCommonAncestor {
    static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;
        if (root == p || root == q)
            return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null)
            return root;

        return left == null ? right : left;

    }
    public static void main(String[] args) {
        // Example usage of the lowestCommonAncestor method

        // Create a sample binary tree
        //        3
        //       / \
        //      5   1
        //     / \ / \
        //    6  2 0  8
        //      / \
        //     7   4
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        // Nodes to find the lowest common ancestor for
        TreeNode p = root.left.right.right;  // Node with value 5
        TreeNode q = root.right.right; // Node with value 4

        System.out.println(lowestCommonAncestor(root, p, q).val);
    }
}
