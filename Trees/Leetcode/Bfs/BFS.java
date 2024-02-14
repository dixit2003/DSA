package Trees.Leetcode.Bfs;


import Trees.TreeNode;

import java.util.*;

public class BFS {
    static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                currentLevel.add(node.val);
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
            ans.add(currentLevel);

        }
        return ans;
    }
    //Zigzag level order
    static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return null;


        Deque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        boolean evenLevel = true;

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> levels = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                if (evenLevel) {
                    TreeNode node = q.pollFirst();
                    if (node.left != null)
                        q.addLast(node.left);
                    if (node.right != null)
                        q.addLast(node.right);
                    levels.add(node.val);
                } else {
                    TreeNode node = q.pollLast();
                    if (node.right != null)
                        q.addFirst(node.right);
                    if (node.left != null)
                        q.addFirst(node.left);
                    levels.add(node.val);
                }

            }
            ans.add(levels);
            evenLevel = !evenLevel;
        }
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println(levelOrder(root));
        System.out.println(zigzagLevelOrder(root));
    }
}
