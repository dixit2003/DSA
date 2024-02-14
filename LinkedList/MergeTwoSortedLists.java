package LinkedList;

public class MergeTwoSortedLists {
    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode h1 = list1;
        ListNode h2 = list2;

        ListNode h = new ListNode(-1);

        while (h1 != null && h2 != null) {
            if (h1.val < h2.val) {
                h.next = h1;
                h1 = h1.next;
            }
            else {
                h.next = h2;
                h2 = h2.next;
            }
        }
        while (h1 != null) {
            h.next = h1;
            h1 = h1.next;
        }
        while (h2 != null) {
            h.next = h2;
            h2 = h2.next;
        }

        return h.next;
    }

    public static void main(String[] args) {
        ListNode node4 = new ListNode(4, null);
        ListNode node2 = new ListNode(2, node4);
        ListNode head = new ListNode(1, node2);

        ListNode node4_1 = new ListNode(4, null);
        ListNode node2_1 = new ListNode(3, node4);
        ListNode head1 = new ListNode(1, node2);

        mergeTwoLists(head, head1);


    }
}
