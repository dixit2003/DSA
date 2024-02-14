package Trees.Leetcode.Bfs;

import Trees.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderSuccessorOfANode {
    static TreeNode successor(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            if (root.left != null)
                return root.left;
            else if (root.right != null)
                return root.right;
            else
                return null; // No Successor
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode nd = q.poll();
            if (nd.left != null) {
                q.add(nd.left);
            }

            if (nd.right != null) {
                q.add(nd.right);
            }

            if (nd.val == val)
                break;
        }
        return q.peek();
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(12);
        root.left.right = new TreeNode(14);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(11);
        root.left.right.left = new TreeNode(36);
        root.left.right.right = new TreeNode(9);

        TreeNode ans = successor(root, 11);
        System.out.println(ans.val);

    }
}
