package LinkedList.Singly;
public class CustomList {

    private Node head;
    private Node tail;
    private int size;

    static class Node {
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

    public CustomList() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    // insert using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index - 1, node.next);
        return node;
    }


    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    //Check for duplicates
    public void  duplicates() {
        Node temp = head;
        while (temp.next != null) {
            if (temp.value == temp.next.value) {
                temp.next = temp.next.next;
                size--;
            } else {
                temp = temp.next;
            }
        }
        tail = temp;
        tail.next = null;
    }
    //Merge two sorted linked lists
    public static CustomList merge(CustomList l1, CustomList l2) {
        Node h1 = l1.head;
        Node h2 = l2.head;

        CustomList ans = new CustomList();

        while (h1 != null && h2 != null) {
            if (h1.value < h2.value ) {
                ans.insertLast(h1.value);
                h1 = h1.next;
            } else {
                ans.insertLast(h2.value);
                h2 = h2.next;
            }
        }
        while (h1 != null)  {
            ans.insertLast(h1.value);
            h1 = h1.next;
        }
        while (h2 != null) {
            ans.insertLast(h2.value);
            h2 = h2.next;
        }
        return ans;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void bubbleSort() {
        bubbleSort(size - 1, 0);
    }

    private void bubbleSort(int r, int c) {
        if (r == 0)
            return;

        if (c < r) {
            Node first = get(c);
            Node second = get(c + 1);

             if (first.value > second.value) {
                 //swap
                 if (first == head) {
                     head = second;
                     first.next = second.next;
                     second.next = first;
                 }else if (second == tail) {
                     Node prev = get(c - 1);
                     prev.next = second;
                     tail = first;
                     first.next = null;
                     second.next = tail;
                 } else {
                     Node prev = get(c - 1);
                     prev.next = second;
                     first.next = second.next;
                     second.next = first;
                 }
            }
            bubbleSort(r, c + 1);
        }else {
            bubbleSort(r - 1, 0);
        }
    }
    public static void main(String[] args) {
        Node n = new Node(5);
    }
}