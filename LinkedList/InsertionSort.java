package LinkedList;

public class InsertionSort {
    public ListNode insertionSortList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode dummy = new ListNode(-1);

        while (head != null) {
            ListNode next = head.next;
            ListNode temp = dummy;

            while (temp.next != null && temp.next.val < head.val) {
                temp = temp.next;
            }
            head.next = temp.next;
            temp.next = head;
            head = next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        
    }
}
