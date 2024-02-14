package StacksAndQueues.Queues;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;
    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }
    public boolean isFull() {
        return end == data.length;
    }
    public boolean isEmpty() {
        return end == 0;
    }
    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }

        data[end++] = item; //Insert and then increment
        return true;
    }
    public int remove() throws Exception{
        if (isEmpty())
            throw new Exception("Queue is full!!!");

        int removed = data[0];
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return removed;
    }
    public int front() throws Exception {
        if (isEmpty())
            throw new Exception("Queue is full!!!");
        return data[0];
    }
    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.println(data[i] + " ");
        }
    }

    public static void main(String[] args) throws Exception {
        CustomQueue q = new CustomQueue();
        q.insert(13);
        q.insert(14);
        q.insert(16);
        q.insert(17);
        q.insert(20);
        q.insert(22);
        q.insert(25);
        q.insert(30);

        q.remove();



        q.display();

    }
}
