package StacksAndQueues.Queues;

public class CircularQueueStructure {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int front = 0;
    protected int end = 0;
    protected int size = 0;
    public CircularQueueStructure() {
        this(DEFAULT_SIZE);
    }

    public CircularQueueStructure(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end == data.length;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }

        data[end++] = item; //Insert and then increment
        end = end % data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if (isEmpty())
            throw new Exception("Queue is full!!!");

        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }
    public int front() throws Exception {
        if (isEmpty())
            throw new Exception("Queue is full!!!");
        return data[front];
    }
    public void display() {
        int i = front;
        do {
            System.out.println(data[i] + " ");
            i++;
            i %= data.length;
        }while (i != end);
    }

    public static void main(String[] args) {

    }
}
