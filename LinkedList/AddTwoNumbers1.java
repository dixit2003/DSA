package LinkedList;


public class AddTwoNumbers1 {

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
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
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode node3 = new ListNode(3, null);
        ListNode node2 = new ListNode(2, node3);
        ListNode head1 = new ListNode(1, node2);


        ListNode node5 = new ListNode(5, null);
        ListNode node4 = new ListNode(2, node5);
        ListNode head2 = new ListNode(4, node4);



        ReverseNodesInGroup.printLinkedList(addTwoNumbers(head1, head2));





    }

}
