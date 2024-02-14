package LinkedList;

import java.util.Scanner;

public class ReorderList {
    static ListNode mid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode pres = head;

        while (pres != null) {
            ListNode next = pres.next;
            pres.next = prev;
            prev = pres;
            pres = next;
        }
        return prev;
    }

    static ListNode reorderList(ListNode head) {
        ListNode mid = mid(head);
        ListNode midNext = mid.next;
        mid.next = null;

        ListNode p1 = reverseList(midNext);
        ListNode temp = p1;
        ListNode p2 = head;

        while (p1 != null && p2 != null) {
            ListNode next = p1.next;
            p1.next = p2;
            p1 = p2;
            p2 = next;
        }
        return temp;
    }

    public static void main(String[] args) {
        ListNode head = null;
        ListNode lh = null;
        System.out.println("Enter length: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        for (int i = 0; i < length; i++) {
            int ele = sc.nextInt();
            if (head == null) {
                head = new ListNode(ele);
                lh = head;
            } else {
                lh.next = new ListNode(ele);
                lh = lh.next;
            }
        }
        display(reorderList(head));
    }
}
