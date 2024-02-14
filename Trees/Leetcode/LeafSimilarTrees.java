package Trees.Leetcode;

import Trees.TreeNode;

public class LeafSimilarTrees {
    static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        String s1 = leafSimilarHelper(root1, "");
        String s2 = leafSimilarHelper(root2, "");

        return s1.equals(s2);
    }
    static String  leafSimilarHelper(TreeNode root, String str) {
        if (isLeaf(root)) {
            str += root.val + " ";
            return str;
        }

        if (root.left != null) {
            str = leafSimilarHelper(root.left, str);
        }
        if (root.right != null) {
            str = leafSimilarHelper(root.right, str);
        }

        return str;
    }
    static boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(1);
        root1.left.left = new TreeNode(6);
        root1.left.right = new TreeNode(2);
        root1.right.left = new TreeNode(9);
        root1.right.right = new TreeNode(8);
        root1.left.right.left = new TreeNode(7);
        root1.left.right.right = new TreeNode(4);

        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(5);
        root2.right = new TreeNode(1);
        root2.left.left = new TreeNode(6);
        root2.left.right = new TreeNode(7);
        root2.right.left = new TreeNode(4);
        root2.right.right = new TreeNode(2);
        root2.right.right.left = new TreeNode(9);
        root2.right.right.right = new TreeNode(8);

        System.out.println(leafSimilar(root1, root2));
    }
}
