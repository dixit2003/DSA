//package Trees.Leetcode;
//
//import Trees.TreeNode;
//
//import java.util.*;
//
//public class AmountofTimeforBinaryTreetoBeInfected {
//    static HashMap<Integer, List<Integer>> al = new HashMap<>();
//    static void amountOfTime(TreeNode root, int start) {
//        addKeys(root);
//        addValues(root);
//
//
//
//    }
//    static void addKeys(TreeNode root) {
//        if (root == null)
//            return;
//
//        al.put(root.val, new ArrayList<>());
//        addKeys(root.left);
//        addKeys(root.right);
//    }
//    static void addValues(TreeNode root) {
//        if (root == null)
//            return;
//
//        if (root.left != null) {
//            al.get(root.val).add(root.left.val);
//            al.get(root.left.val).add(root.val);
//        }
//        if (root.right != null) {
//            al.get(root.val).add(root.right.val);
//            al.get(root.right.val).add(root.val);
//        }
//        addValues(root.left);
//        addValues(root.right);
//
//    }
//
//    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(5);
//        root.right = new TreeNode(3);
//        root.left.right = new TreeNode(4);
//        root.left.right.left = new TreeNode(9);
//        root.left.right.right = new TreeNode(2);
//        root.right.left = new TreeNode(10);
//        root.right.right = new TreeNode(6);
//
//        amountOfTime(root, 3);
//    }
//}
