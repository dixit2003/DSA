package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedListComponents {
    static int numComponents(ListNode head, int[] nums) {
        ListNode curr = head;
        Set<Integer> set = new HashSet<>();
        int ans = 0;

        for (int ele: nums) {
            set.add(ele);
        }
        boolean flag = false;

        while (curr != null) {
            while (curr != null && set.contains(curr.val)) {
                flag = true;
                curr = curr.next;
            }
            if (flag) {
                ans++;
            }
            flag = false;

            if (curr != null) {
                curr = curr.next;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ListNode n5 = new ListNode(4, null);
        ListNode n4 = new ListNode(3, n5);
        ListNode n3 = new ListNode(2, n4);
        ListNode n2 = new ListNode(1, n3);
        ListNode n1 = new ListNode(0, n2);

        int[] nums = {0, 3, 2, 4};

        System.out.println(numComponents(n1, nums));
    }
}
