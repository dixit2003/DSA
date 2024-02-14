package LinkedList;

import javax.print.attribute.standard.SheetCollate;
import java.util.Arrays;

public class SpiralMatrix4 {
    static int[][] spiralMatrix(int m, int n, ListNode head) {
        ListNode tail = head;
        int length = 0;

        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        length += 1;

        while (length != m * n) {
            tail.next = new ListNode(-1);
            tail = tail.next;
            length++;
        }

        return makeSpiralMatrix(m, n, head);
    }
    static int[][] makeSpiralMatrix(int r, int c, ListNode head) {
        int[][] ans = new int[r][c];
        int top = 0;
        int bottom = r - 1;
        int left = 0;
        int right = c - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                ans[top][i] = head.val;
                head = head.next;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                ans[i][right] = head.val;
                head = head.next;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left  ; i--) {
                    ans[bottom][i] = head.val;
                    head = head.next;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top ; i--) {
                    ans[i][left] = head.val;
                    head = head.next;
                }
                left++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ListNode node7 = new ListNode(7, null);
        ListNode node6 = new ListNode(6, node7);
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);

        int[][] ans = spiralMatrix(3, 3, head);

        System.out.println(Arrays.deepToString(ans));

    }
}
