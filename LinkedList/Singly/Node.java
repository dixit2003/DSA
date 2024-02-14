package LinkedList.Singly;


public class Node {

    public static void main(String[] args) {
        CustomList list = new CustomList();
        list.insertFirst(13);
        list.insertLast(14);
        list.insert(15, 2);
        list.insertLast(20);
        list.insert(16, 3);
        list.insert(17, 4);
        list.insert(18, 5);
        list.insertFirst(3);
        list.insert(3, 0);
        list.insert(3, 0);

        list.insertLast(20);
        list.insertLast(20);
        list.insertLast(20);

//        list.display();

//        list.insertRec(3, 4);
        list.duplicates();
//        list.display();

        CustomList l2 = new CustomList();
        l2.insertLast(10);
        l2.insertLast(20);
        l2.insertLast(22);
        l2.insertLast(22);
        l2.insertLast(25);
        l2.insertLast(28);
        l2.insertLast(27);
        l2.insertFirst(33);


//        CustomList ans = CustomList.merge(list, l2);
//        ans.display();
//        l2.display();
        l2.bubbleSort();
        l2.display();

    }
}