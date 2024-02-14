package Trees.Leetcode.Dfs;

import Trees.TreeNode;
import com.sun.source.tree.Tree;
import com.sun.source.tree.TryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DiameterOfTree {
    static int diameter = 0;
    static int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }
    static int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = height(node.left);
        int right = height(node.right);

        int dia = left + right;
        diameter = Math.max(dia, diameter);

        return Math.max(left, right) + 1;
    }
    static TreeNode buildTree(String str) {
        if (str.charAt(0) == 'N')
            return null;

        String[] nodes = str.split(" ");

        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int i = 1;
        while (!q.isEmpty() && i < nodes.length) {
            TreeNode n = q.poll();
            if (!nodes[i].equals("N")) {
                n.left = new TreeNode(Integer.parseInt(nodes[i]));
                q.offer(n.left);
            }
            i++;

            if (i < nodes.length && !nodes[i].equals("N")) {
                n.right = new TreeNode(Integer.parseInt(nodes[i]));
            }
            i++;
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        TreeNode root = buildTree(str);
        System.out.println(diameterOfBinaryTree(root));
    }
}
