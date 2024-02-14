package Trees.Leetcode;

import Trees.TreeNode;

public class MinDepth {
    static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null)
            return minDepth(root.right) + 1;
        if (root.right == null)
            return minDepth(root.left) + 1;

        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        TreeNode symmetricTree = new TreeNode(3);
        symmetricTree.left = new TreeNode(9);
        symmetricTree.right = new TreeNode(20);
        symmetricTree.right.left = new TreeNode(15);
        symmetricTree.right.right = new TreeNode(7);

        System.out.println(minDepth(symmetricTree));
    }
}
