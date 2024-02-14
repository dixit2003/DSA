package Trees.Leetcode.Dfs;

import ObjectOrientedProgramming.Interfaces.A;
import Trees.TreeNode;

import java.util.Arrays;

public class ConstructBinaryTreeFromInorderAndPostorder {
    static TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0) {
            return null;
        }
        int node = postorder[postorder.length - 1];
        int index = -1;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == node) {
                index = i;
                break;
            }
        }
        TreeNode root = new TreeNode(node);
        root.left = buildTree(Arrays.copyOfRange(inorder, 0, index), Arrays.copyOfRange(postorder, 0, index));
        root.right = buildTree(Arrays.copyOfRange(inorder, index + 1, inorder.length), Arrays.copyOfRange(postorder, index, postorder.length - 1));

        return root;
    }

    public static void main(String[] args) {
        int[] inorder = {9, 3, 15, 20, 7}; // Example in-order traversal array
        int[] postorder = {9, 15, 7, 20, 3};

        TreeNode root = buildTree(inorder, postorder);
    }
}
