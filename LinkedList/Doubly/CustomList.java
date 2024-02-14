package LinkedList.Doubly;

public class CustomList {
    Node head;
    Node tail;
    int size;
    public CustomList() {
        this.size = 0;
    }
    private class Node {
        int val;
        Node prev;
        Node next;

        public Node(int val) {
            this.val = val;
        }
        public Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }

    }

    public void insertAtStart(int val) {
        Node atStart = new Node(val);
        if (head != null)
            head.prev = atStart;
        atStart.next = head;
        atStart.prev = null;
        head = atStart;

        size++;
    }
    public void insertAtLast(int val) {
        Node atEnd = new Node(val);
        Node last = head;
        if (head == null) {
            atEnd.prev = null;
            head = atEnd;
        }
        atEnd.next = null;
        while (last.next != null) {
            last = last.next;
        }
        last.next = atEnd;
        atEnd.prev = last;
        tail = atEnd;

        size++;
    }
    public void insertAtIndex(int val, int pos) {

        if (pos == 0) {
            insertAtStart(val);
            return;
        }
        if (pos == size) {
            insertAtLast(val);
            return;
        }
        Node atPos = new Node(val);
        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        atPos.next = temp.next;
        temp.next.prev = atPos;
        atPos.prev = temp;
        temp.next = atPos;

        size++;
    }
    public void dispaly() {
        Node temp = head;
        System.out.print("NULL <-> ");
        while (temp != null) {
            System.out.print(temp.val + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

    }
}
