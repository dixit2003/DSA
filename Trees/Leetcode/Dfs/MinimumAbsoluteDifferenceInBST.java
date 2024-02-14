package Trees.Leetcode.Dfs;

import Trees.TreeNode;

public class MinimumAbsoluteDifferenceInBST {
    static int prev = -100000;
    static int min = 100000;
    static int getMinimumDifference(TreeNode node) {
        if (node == null) return min;

        getMinimumDifference(node.left);
        min = Math.min(min, node.val - prev);
        prev = node.val;
        getMinimumDifference(node.right);

        return min;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        System.out.println(getMinimumDifference(root));
    }
}
