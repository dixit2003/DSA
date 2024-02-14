package StacksAndQueues.Stacks;

public class Stack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int pointer = -1;

    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (pointer == data.length - 1){
            System.out.println("Stack is full!!!");
            return false;
        }
        pointer++;
        data[pointer] = item;
        return true;
    }

    public boolean isEmpty() {
        return pointer == -1;
    }

    public int pop() throws StackExceptions {
        if (isEmpty())
            throw new StackExceptions("Cannot pop from an empty stack!!!");
        return data[pointer--]; //Remove and then decrement;
    }
    public int peak() throws StackExceptions {
        if (pointer == -1)
            throw new StackExceptions("Cannot peak from an empty stack");
        return data[pointer];
    }

    public static void main(String[] args) throws StackExceptions {
        Stack stack = new Stack(5);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        stack.push(16);
        stack.push(17);
        stack.push(20);
        stack.push(23);

        System.out.println(stack.peak());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.peak());
        stack.pop();
        System.out.println(stack.peak());

    }
}
