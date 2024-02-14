package LinkedList;

import static LinkedList.ReorderList.display;

public class RemoveNthNodeFromEnd {
    static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null && n == 1) {
            return null;
        }
        ListNode node = new ListNode();
        node.next = head;
        ListNode first = node;
        ListNode second = node;

        for (int i = 0; i < n; i++) {
            first = first.next;
        }
        while (first.next != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;

        return node.next;
    }

    public static void main(String[] args) {
        ListNode node7 = new ListNode(5, null);
        ListNode node6 = new ListNode(4, node7);
        ListNode node5 = new ListNode(4, node6);
        ListNode node4 = new ListNode(3, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);

        ListNode ans = removeNthFromEnd(head, 3);
        display(ans);
    }
}
