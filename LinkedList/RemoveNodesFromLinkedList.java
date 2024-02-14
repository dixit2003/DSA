package LinkedList;

import static LinkedList.ReorderList.display;

public class RemoveNodesFromLinkedList {
    static ListNode removeNodes(ListNode head) {
        head = reverseList(head);

        ListNode hold = head;
        ListNode sup = head.next;

        while (sup != null) {
            if (sup.val >= hold.val) {
                hold.next = sup;
                hold = sup;
            }
            sup = sup.next;
        }
        hold.next = null;
        return reverseList(head);
    }

    static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev; 
    }

    public static void main(String[] args) {
        ListNode node4 = new ListNode(1, null);
        ListNode node3 = new ListNode(1, node4);
        ListNode node2 = new ListNode(1, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode head = new ListNode(1, node1);

        ListNode ans = removeNodes(head);
        display(ans);
    }
}
