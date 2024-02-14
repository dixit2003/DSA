package Trees.Leetcode.Dfs;

import Trees.TreeNode;

public class PseudoPalindromicPaths {
    static int count = 0;
    static int pseudoPalindromicPaths (TreeNode root) {
        if (root.left == null && root.right == null) {
            return 1;
        }
        int[] arr = new int[10];
        pseudoPalindromicPathsHelper(root, arr);
        return count;
    }

    static void pseudoPalindromicPathsHelper(TreeNode root, int[] arr) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            arr[root.val - 1]++;
            int oddCount = 0;
            for (int ele: arr) {
                if (ele % 2 == 1) {
                    oddCount++;
                }
            }
            if (oddCount == 1) {
                count += 1;
            }
            arr[root.val - 1]--;
            return;
        }
        arr[root.val - 1]++;
        pseudoPalindromicPathsHelper(root.left, arr);
        pseudoPalindromicPathsHelper(root.right, arr);
        arr[root.val - 1]--;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.left.right.right = new TreeNode(1);

        System.out.println(pseudoPalindromicPaths(root));
    }
}
