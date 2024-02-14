import Trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class TreesSolution {
    static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        helper(root, ans);
        return ans;
    }
    static void helper(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return;
        }
        helper(root.left, ans);
        ans.add(root.val);
        helper(root.right, ans);
    }
    static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }

        else {
            return false;
        }
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        System.out.println(isSameTree(root1, root2));
    }

}
