package LinkedList.Circular;

public class CustomList {
    Node head;
    Node tail;

    public CustomList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }
    public CustomList() {
        this.head = null;
        this.tail = null;
    }
    private class Node {
        int val;
        Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
        public Node(int val) {
            this.val = val;
        }
    }
    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void delete(int value) {
        Node temp = head;
        if (temp.val == value) {
            head = head.next;
            tail.next = head;
        }
        do {
            Node n = temp.next;
            if (n.val == value) {
                temp.next = n.next;
            }
        } while (temp != head);
    }
    public void display() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println(temp.val);
    }

    public static void main(String[] args) {

    }
}
