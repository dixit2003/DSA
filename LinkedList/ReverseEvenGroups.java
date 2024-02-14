package LinkedList;

import java.util.Random;
import java.util.random.RandomGenerator;

public class ReverseEvenGroups {
    static ListNode reverseEvenLengthGroups(ListNode head) {
        if (head.next == null || head.next.next == null) {
            return head;
        }
        ListNode tail = head;
        int group = 1;

        while (tail != null && tail.next != null) {
            group++;
            int countNodes = 0;
            ListNode hold = tail.next;
            while (hold != null && countNodes < group) {
                hold = hold.next;
                countNodes++;
            }
            if (countNodes % 2 == 0) {
                ListNode prev = null;
                ListNode curr = tail.next;
                ListNode next = null;
                for (int i = 0; i < countNodes; i++) {
                    next = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = next;
                }
                ListNode temp = tail.next;
                temp.next = curr;
                tail.next = prev;
                tail = temp;
            } else {
                for (int i = 0; i < countNodes; i++) {
                    tail = tail.next;
                }
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode _node9 = new ListNode(4, null);
        ListNode _node8 = new ListNode(8, _node9);
        ListNode _node7 = new ListNode(3, _node8);
        ListNode _node6 = new ListNode(7, _node7);
        ListNode node9 = new ListNode(4, _node6);
        ListNode node8 = new ListNode(8, node9);
        ListNode node7 = new ListNode(3, node8);
        ListNode node6 = new ListNode(7, node7);
        ListNode node5 = new ListNode(1, node6);
        ListNode node4 = new ListNode(9, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(6, node3);
        ListNode node1 = new ListNode(2, node2);
        ListNode head = new ListNode(5, node1);


        ReverseNodesInGroup.printLinkedList(reverseEvenLengthGroups(head));

    }
}
