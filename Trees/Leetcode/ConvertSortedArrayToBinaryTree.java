package Trees.Leetcode;

import Trees.BST;
import Trees.BinaryTree;
import Trees.PopulateSortedArray;
import Trees.TreeNode;

public class ConvertSortedArrayToBinaryTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }
    static TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + ((end - start) / 2);
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, start, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, end);

        return root;
    }

    public static void main(String[] args) {
        TreeNode symmetricTree = new TreeNode(3);
        symmetricTree.left = new TreeNode(9);
        symmetricTree.right = new TreeNode(20);
        symmetricTree.right.left = new TreeNode(15);
        symmetricTree.right.right = new TreeNode(7);
    }
}
