package Trees.Leetcode;

import Trees.TreeNode;
import java.util.Stack;
class Solution {
    static boolean findTarget(TreeNode root, int k) {
        if(root == null) return false;
        TwoSumInBST l = new TwoSumInBST(root,false);
        TwoSumInBST r = new TwoSumInBST(root,true);

        int i = l.next();
        int j = r.next();

        while(i < j){
            int sum = i + j;
            if(sum == k) return true;
            else if(sum < k) i = l.next();
            else j = r.next();
        }
        return false;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        System.out.println(findTarget(root, 9));
    }
}
public class TwoSumInBST {
    Stack<TreeNode> st = new Stack<>();
    boolean reverse;
    public  TwoSumInBST(TreeNode root, boolean isreverse){
        reverse = isreverse;
        addElements(root);
    }
    public void addElements(TreeNode root){
        while(root != null){
            st.push(root);
            if(reverse){
                root = root.right;
            }
            else root = root.left;
        }
    }
    public int next(){
        TreeNode node = st.pop();
        if(reverse){
            addElements(node.left);
        }
        else addElements(node.right);
        return node.val;
    }
    public boolean hasnext(){
        return !st.isEmpty();
    }
}
