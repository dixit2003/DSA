package LinkedList;

import java.util.List;

public class RemoveZeroSumConsecutiveNodes {
    static ListNode skipZeroNodes(ListNode temp) {
        int sum = 0;
        ListNode node = temp;
        while (node != null) {
            sum += node.val;
            if (sum == 0) {
                return node.next;
            } else {
                node = node.next;
            }
        }
        return temp;
    }
    static ListNode removeZeroSumNodes(ListNode head) {
        ListNode dh = new ListNode(-1, head);
        ListNode prev = dh;
        ListNode temp = prev.next;

        while (temp != null) {
            ListNode node = skipZeroNodes(temp);
            if (node != temp) {
                prev.next = node;
                temp = prev.next;
            } else {
                prev = temp;
                temp = temp.next;
            }
        }
        return dh.next;
    }

    public static void main(String[] args) {
        ListNode n5 = new ListNode(4, null);
        ListNode n4 = new ListNode(-3, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode head = new ListNode(1, n2);

        ReverseNodesInGroup.printLinkedList(removeZeroSumNodes(head));
    }
}
