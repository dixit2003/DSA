package Trees.Leetcode.Dfs;

import Trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root != null) {
            traverse(root, "", paths);
        }
        return paths;
    }

    private void traverse(TreeNode node, String path, List<String> paths) {
        if (node.left == null && node.right == null) {
            paths.add(path + node.val);
            return;
        }

        if (node.left != null) {
            traverse(node.left, path + node.val + "->", paths);
        }

        if (node.right != null) {
            traverse(node.right, path + node.val + "->", paths);
        }
    }

    public static void main(String[] args) {

    }
}
