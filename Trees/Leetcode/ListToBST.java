package Trees.Leetcode;

import LinkedList.ListNode;
import Trees.TreeNode;

public class ListToBST {
    static TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        return sortedListToBSTHelper(head, null);
    }

    static TreeNode sortedListToBSTHelper(ListNode head, ListNode tail) {
        ListNode slow = head;
        ListNode fast = head;
        if (head == tail) {
            return null;
        }
        while (fast != tail && fast.next != tail) {
            slow = slow.next;
            fast = fast.next.next;
        }
        TreeNode thread = new TreeNode(slow.val);
        thread.left = sortedListToBSTHelper(head, slow);
        thread.right = sortedListToBSTHelper(slow.next, tail);

        return thread;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(-10);
        head.next = new ListNode(-3);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(9);

        // Call the sortedListToBST method
        TreeNode root = sortedListToBST(head);

    }
}
