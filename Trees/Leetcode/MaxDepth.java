package Trees.Leetcode;

import Trees.TreeNode;

public class MaxDepth {
    static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        TreeNode symmetricTree = new TreeNode(3);
        symmetricTree.left = new TreeNode(9);
        symmetricTree.right = new TreeNode(20);
        symmetricTree.right.left = new TreeNode(15);
        symmetricTree.right.right = new TreeNode(7);

        System.out.println(maxDepth(symmetricTree));
    }
}
