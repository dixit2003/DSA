package Trees.Leetcode.Dfs;

import Trees.TreeNode;


public class KthSmallestElement {
    static int count = 0;

    static int kthSmallest(TreeNode root, int k) {
        return helper(root, k).val;
    }
    static TreeNode helper(TreeNode root, int k) {
        if (root == null)
            return null;

        TreeNode left = helper(root.left, k);

        if (left != null)
            return left;

        count++;

        if (count == k)
            return root;

        return helper(root.right, k);
    }
    public static void main(String[] args) {
        // Creating a sample binary search tree
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);

        int k = 3;

        // Find the kth smallest element in the BST
        int kthSmallest = kthSmallest(root, k);

        System.out.println("The " + k + "th smallest element in the BST is: " + kthSmallest);
    }
}
