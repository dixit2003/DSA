package Trees.Leetcode.Dfs;

import Trees.TreeNode;

public class CheckIfPathExists {
    static boolean pathExistence(TreeNode root, int[] arr) {
        if (root == null)
            return arr.length == 0;
        return helper(root, arr, 0);
    }
    static boolean helper(TreeNode root, int[] arr, int i) {
        if (root == null)
            return false;
        if (i >= arr.length || root.val != arr[i])
            return false;

        if (root.left == null && root.right == null && i == arr.length - 1)
            return true;

        return helper(root.left, arr, i + 1) || helper(root.right, arr, i + 1);
    }
}
