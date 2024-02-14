package Trees;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    static TreeNode incresingBST(TreeNode root) {
        TreeNode ans = new TreeNode(-1);
        TreeNode ansPoint = ans;
        helper(root, ansPoint);
        return ans.right;
    }
    static void helper(TreeNode root, TreeNode ansPoint) {
        if (root == null) {
            return;
        }
        helper(root.left, ansPoint);
        ansPoint.right = new TreeNode(root.val);
        ansPoint = ansPoint.right;
        helper(root.right, ansPoint);
    }

    public static void main(String[] args) {

    }
}
