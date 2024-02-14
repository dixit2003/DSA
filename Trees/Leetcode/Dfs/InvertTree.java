package Trees.Leetcode.Dfs;

import Trees.TreeNode;

public class InvertTree {
    static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    public static void main(String[] args) {
        TreeNode symmetricTree = new TreeNode(4);
        symmetricTree.left = new TreeNode(2);
        symmetricTree.right = new TreeNode(7);
        symmetricTree.left.left = new TreeNode(1);
        symmetricTree.left.right = new TreeNode(3);
        symmetricTree.right.left = new TreeNode(6);
        symmetricTree.right.right = new TreeNode(9);

        System.out.println(invertTree(symmetricTree));
    }
}
