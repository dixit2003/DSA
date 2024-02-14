package LinkedList;

public class SwapNodesInPairs {
    static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dh = new ListNode(-1, head);
        ListNode tail = dh;

        while (tail.next != null && tail.next.next != null) {
            ListNode f = tail.next;
            ListNode s = tail.next.next;
            tail.next = s;
            f.next = s.next;
            s.next = f;
            tail = tail.next.next;
        }

        return dh.next;
    }

    public static void main(String[] args) {
        ListNode n5 = new ListNode(5, null);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode head = new ListNode(1, n2);
    }
}

