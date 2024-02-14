package LinkedList;

import java.util.Random;

public class ReverseNodesInGroup {
    static int length(ListNode head) {
        ListNode curr = head;
        int length = 0;
        while (curr != null) {
            length++;
            curr = curr.next;
        }
        return length;
    }
    static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) {
            return head;
        }

        ListNode dummyHead = new ListNode(0, head);
        ListNode tail = dummyHead;
        ListNode curr = head;
        int count = 0;

        // Count the number of nodes in the list
        while (curr != null) {
            curr = curr.next;
            count++;
        }

        while (count >= k) {
            ListNode groupHead = tail.next;
            ListNode groupTail = null;
            curr = groupHead;

            for (int i = 0; i < k; i++) {
                ListNode nextNode = curr.next;
                curr.next = groupTail;
                groupTail = curr;
                curr = nextNode;
            }

            tail.next = groupTail;
            groupHead.next = curr;

            tail = groupHead;
            count -= k;
        }
        return dummyHead.next;
    }

    static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode node5 = new ListNode(5, null);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);

        printLinkedList(reverseKGroup(head, 2));



    }

}