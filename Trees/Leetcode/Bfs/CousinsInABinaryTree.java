package Trees.Leetcode.Bfs;

import Trees.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class CousinsInABinaryTree {
    static boolean isCousins1(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            boolean foundX = false;
            boolean foundY = false;

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();

                if (node.val == x) {
                    foundX = true;
                }
                if (node.val == y) {
                    foundY = true;
                }
                if (node.left != null && node.right != null) {
                    if ((node.left.val == x && node.right.val == y) || (node.left.val == y && node.right.val == x)) {
                        return false;
                    }
                }

                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }

            // If both x and y were found at this level, they are cousins
            if (foundX && foundY) {
                return true;
            }

            // If only one of x or y was found at this level, they cannot be cousins
            if (foundX || foundY) {
                return false;
            }
        }
        return false; // x and y not found
    }
    static boolean isCousins2(TreeNode root, int x, int y) {
        TreeNode n1 = findNode(root, x);
        TreeNode n2 = findNode(root, y);

        return ((level(root, n1, 0) == level(root, n2, 0)) && (isSibling(root, n1, n2)));
    }
    static TreeNode findNode(TreeNode node, int x) {
        if (node == null)
            return null;
        if (node.val == x)
            return node;

        TreeNode n = findNode(node.left, x);
        if (n != null)
            return n;
        return findNode(node.right, x);
    }
    static boolean isSibling(TreeNode node, TreeNode n1, TreeNode n2) {
        if (node == null)
            return false;

        return (node.left == n1 && node.right == n2) || (node.left == n2 && node.right == n1) || isSibling(node.left, n1, n2) || isSibling(node.right, n1, n2);
    }

    static int level(TreeNode root, TreeNode n1, int level) {
        if (root == null) {
            return 0;
        }
        if (root == n1) {
            return level;
        }
        int l = level(root.left, n1, level + 1);
        if (level != 0)
            return level;
        return level(root.right, n1, level + 1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);



        // Test isCousins1
        int x = 5;
        int y = 6;
        boolean result1 = isCousins1(root, x, y);
        boolean result2 = isCousins2(root, x, y);
        System.out.println(result1);
        System.out.println(result2);
    }
}
