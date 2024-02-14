package LinkedList;

public class ReverseLinkedList2 {
    static ListNode1 reverse (ListNode1 head, int left, int right) {
        ListNode1 prev = null;
        ListNode1 pres = head;

        for (int i = 0; i < left - 1; i++) {
            prev = pres;
            pres = pres.next;
        }
        ListNode1 lastEnd = prev;
        ListNode1 newEnd = pres;

        ListNode1 newNext = pres.next;
        for (int i = 0; i < (right - left + 1); i++) {
            pres.next = prev;
            prev = pres;
            pres = newNext;
            if (newNext.next != null) {
                newNext = newNext.next;
            }
        }
        if (lastEnd != null) {
            lastEnd.next = pres;
        }
        newEnd.next = newNext;

        return head;


    }
}
