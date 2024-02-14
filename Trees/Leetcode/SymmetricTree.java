package Trees.Leetcode;

import Trees.TreeNode;
import com.sun.source.tree.Tree;

public class SymmetricTree {
    static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }
    static boolean isSymmetric(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val == q.val) {
            return isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        TreeNode symmetricTree = new TreeNode(1);
        symmetricTree.left = new TreeNode(2);
        symmetricTree.right = new TreeNode(2);
        symmetricTree.left.left = new TreeNode(3);
        symmetricTree.left.right = new TreeNode(4);
        symmetricTree.right.left = new TreeNode(4);
        symmetricTree.right.right = new TreeNode(3);

        System.out.println(isSymmetric(symmetricTree));
    }
}
