package Implementations.LinkedList;

public class CircularLinkedList {
    Node head;
    Node tail;

    public CircularLinkedList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }
    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }
    private class Node {
        int val;
        Node next;

        public Node() {

        }

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
        if (head == null) {
            return;
        }
        Node curr = head;
        Node prev = new Node();

        while (curr.val != value) {
            if (curr.next == head) {
                System.out.println("Node not found!!!");
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        // check if node is the only node
        if (curr == head && curr.next == head) {
            head = null;
            return;
        }
        // If more than one node exists, check if it is the first node
        if (curr == head) {
            prev = head;
            while (prev.next != head) {
                prev = prev.next;
            }
            head = curr.next;
            prev.next = head;
        }
        // Check if it is the last node
        else if (curr.next == head) {
            prev.next = head;
        }
        // If at any random node
        else {
            prev.next = curr.next;
        }
    }

    public void display() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println("Head");
    }

    public static void main(String[] args) {
        CircularLinkedList l = new CircularLinkedList();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.insert(5);
        l.insert(6);
        l.insert(7);

        l.display();

        l.delete(5);

        l.display();
    }
}
