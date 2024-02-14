package LinkedList;

import java.util.Arrays;
import java.util.InputMismatchException;

public class FindMinMaxBetweenCriticalPoints {
    static int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        ListNode pres = prev.next;

        int lc = -1;
        int firstPoint = -1;

        int maxima = Integer.MIN_VALUE;
        int minima = Integer.MAX_VALUE;

        int a = 0;

        while (pres.next != null) {
            a += 1;
            if (pres.val > prev.val && pres.val > pres.next.val || pres.val < prev.val && pres.val < pres.next.val) {
                if (firstPoint == -1) {
                    firstPoint = a;
                }
                if (lc != -1) {
                    maxima = Math.max(maxima, a - firstPoint);
                    minima = Math.min(minima, a - lc);
                }
                lc = a;
            }
            prev = pres;
            pres = pres.next;
        }
        if (lc != -1 && minima != Integer.MAX_VALUE && maxima != Integer.MIN_VALUE) {
            return new int[] {minima, maxima};
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        ListNode n7 = new ListNode(2, null);
        ListNode n6 = new ListNode(1, n7);
        ListNode n5 = new ListNode(5, n6);
        ListNode n4 = new ListNode(2, n5);
        ListNode n3 = new ListNode(1, n4);
        ListNode n2 = new ListNode(3, n3);
        ListNode head = new ListNode(5, n2);

        System.out.println(Arrays.toString(nodesBetweenCriticalPoints(head)));
    }
}
