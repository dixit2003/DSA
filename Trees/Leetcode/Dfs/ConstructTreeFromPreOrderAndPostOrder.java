package Trees.Leetcode.Dfs;

import Trees.TreeNode;

import java.util.Arrays;

public class ConstructTreeFromPreOrderAndPostOrder {
    static TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0)
            return null;

        int r = preorder[0];
        int index = 0;

        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == r) {
                index = i;
                break;
            }
        }
        TreeNode node = new TreeNode(r);
        node.left = buildTree(Arrays.copyOfRange(preorder, 1, index + 1), Arrays.copyOfRange(inorder, 0, index));
        node.right = buildTree(Arrays.copyOfRange(preorder, index + 1, preorder.length), Arrays.copyOfRange(inorder, index + 1, preorder.length));

        return node;
    }

    public static void main(String[] args) {
        int[] preorder = {3, 8, 9, 20, 15, 7}; // Example pre-order traversal array
        int[] inorder = {9, 8, 3, 15, 20, 7}; // Example in-order traversal array

        TreeNode root = buildTree(preorder, inorder);
    }
}
