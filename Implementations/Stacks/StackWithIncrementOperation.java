package Implementations.Stacks;
public class StackWithIncrementOperation {
    private int[] data;
    int top;
    int maxSize;

    public StackWithIncrementOperation(int maxSize) {
        data = new int[maxSize];
        top = -1;
        this.maxSize = maxSize;
    }

    public void push(int x) {
        if (top < maxSize - 1) {
            top++;
            data[top] = x;
        }
    }

    public int pop() {
        if (top == -1) {
            return -1;
        }
        return data[top--];
    }

    public void increment(int k, int val) {
        int m = (int) Math.min(k, data.length);
        for (int i = 0; i < m; i++) {
            data[i] += val;
        }
    }
}
