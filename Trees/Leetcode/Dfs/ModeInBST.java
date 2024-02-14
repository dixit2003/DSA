package Trees.Leetcode.Dfs;

import Trees.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModeInBST {
    static TreeNode prev;
    static int count = 1;
    static int max = 0;
    static int[] findMode(TreeNode root) {
        List<Integer> modes = new ArrayList<>();
        findModeHelper(root, modes);
        int[] ans = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            ans[i] = modes.get(i);
        }
        return ans;
    }
    static void findModeHelper(TreeNode root, List<Integer> list) {
        if (root == null)
            return;

        findModeHelper(root.left, list);

        if (prev != null) {
            if (prev.val == root.val) {
                count++;
            }
            else {
                count = 1;
            }
        }

        if (count > max) {
            max = count;
            list.clear();
            list.add(root.val);
        }
        else if (count == max) {
            list.add(root.val);
        }
        prev = root;
        findModeHelper(root.right, list);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(4);
        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(4);
        root.left.left.left.left = new TreeNode(2);
        root.left.left.left.right = new TreeNode(3);
        root.left.left.left.right.left = new TreeNode(3);
        root.left.left.left.right.right = new TreeNode(3);
        root.right.right = new TreeNode(7);

        System.out.println(Arrays.toString(findMode(root)));

    }
}
