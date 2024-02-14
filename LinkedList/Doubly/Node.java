package LinkedList.Doubly;

public class Node {
    public static void main(String[] args) {
        CustomList list = new CustomList();
        for (int i = 1; i <= 5; i++) {
            list.insertAtStart(i);
        }

        for (int i = 5; i >= 1; i--) {
            list.insertAtLast(i);
        }
        list.insertAtIndex(20, 3);
        list.insertAtIndex(10, 5);
        list.insertAtIndex(30, 0);

        list.dispaly();
    }

}
