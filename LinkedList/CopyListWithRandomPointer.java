package LinkedList;

import java.util.List;

public class CopyListWithRandomPointer {
    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public Node copyRandomList(Node head) {
        Node curr = head;

        //Modifying head
        while (curr != null) {
            Node next = curr.next;
            Node copy = new Node(curr.val);
            curr.next = copy;
            copy.next = next;
            curr = next;
        }
        // Provide with randoms
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
        //Restore deep head
        curr = head;
        Node dh = new Node(-1);
        Node deepCopy1 = dh;
        while (curr != null) {
            Node newNode = curr.next.next;
            Node copyNode = curr.next;
            deepCopy1.next = copyNode;
            deepCopy1 = deepCopy1.next;

            curr.next = newNode;
            curr = newNode;
        }
        return dh.next;
    }
}