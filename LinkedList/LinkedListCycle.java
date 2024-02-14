package LinkedList;

public class LinkedListCycle {
    //Amazon and microsoft
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    //Fast and slow pointer
    public boolean hasCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast= fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
    //Find length of the cycle
    public int cycleLength(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast= fast.next.next;
            slow = slow.next;
            if(fast == slow){
                //calculate length
                Node temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                }while (slow != fast);
                return length;
            }
        }
        return 0;
    }
    public Node detectCycle(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
