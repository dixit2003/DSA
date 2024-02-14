package LinkedList.Singly;
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class MergeSort {
    public ListNode getMid(ListNode head){
        ListNode midPrev = null;
        while(head != null && head.next != null){
            midPrev = (midPrev == null) ? head : midPrev.next;
            head=head.next.next;
        }

        ListNode mid = midPrev.next;
        midPrev.next = null;

        return mid;
    }
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeSort(left, right);
    }
    public ListNode mergeSort(ListNode l1, ListNode l2) {
        ListNode dumHead = new ListNode();
        ListNode tail = dumHead;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
                tail = tail.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
                tail = tail.next;
            }
        }
        tail.next = (l1 != null) ? l1 : l2;
        return dumHead.next;
    }
    public void display(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        ListNode node2 = new ListNode(2);
        ListNode node1 = new ListNode(1);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(7);
        ListNode node5 = new ListNode(14);
        ListNode node6 = new ListNode(10);
        ListNode node7 = new ListNode(12);
        head.next = node2;
        node2.next = node1;
        node1.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        MergeSort sort = new MergeSort();
        // Sort the linked list using sortList function
        ListNode sortedList = sort.sortList(head);

        // Print the sorted linked list
        sort.display(sortedList);
    }
}
