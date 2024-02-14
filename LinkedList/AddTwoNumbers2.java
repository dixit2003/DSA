package LinkedList;

public class AddTwoNumbers2  extends ReorderList{

    static ListNode addLists(ListNode l1, ListNode l2) {
        l1 = ReorderList.reverseList(l1);
        l2 = ReorderList.reverseList(l2);
        ListNode dummyHead = new ListNode(-1);
        ListNode tail = dummyHead;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            tail.next = new ListNode(digit);
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        return ReorderList.reverseList(dummyHead.next);
    }

    public static void main(String[] args) {
        ListNode n7 = new ListNode(4, null);
        ListNode n6 = new ListNode(6, n7);
        ListNode l2 = new ListNode(5, n6);
        ListNode n4 = new ListNode(3, null);
        ListNode n3 = new ListNode(4, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode l1 = new ListNode(7, n2);

        ReorderList.display(addLists(l1, l2));



    }
}
