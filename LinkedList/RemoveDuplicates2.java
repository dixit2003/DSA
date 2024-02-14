package LinkedList;

import static LinkedList.ReorderList.display;

public class RemoveDuplicates2 {
    static ListNode deleteDuplicates(ListNode head) {
        ListNode dh = new ListNode(-1, head);
        ListNode dum = dh;
        ListNode tail = head;

        while (tail != null) {
            if (tail.next != null && tail.next.val == tail.val) {
                while (tail.next != null && tail.val == tail.next.val) {
                    tail = tail.next;
                }
                dh.next = tail.next;
            }
            else {
                dh = tail;
            }
            tail = tail.next;
        }
        return dum.next;
    }

    public static void main(String[] args) {
        ListNode node7 = new ListNode(5, null);
        ListNode node6 = new ListNode(4, node7);
        ListNode node5 = new ListNode(4, node6);
        ListNode node4 = new ListNode(3, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);

        display(deleteDuplicates(head));

    }
}
