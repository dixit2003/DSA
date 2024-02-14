package Implementations.Stacks;



public class Stacks {
    private static final int SIZE = 10;
    private int[] data;
    int pointer = -1;
    public Stacks() {
        this(SIZE);
    }

    public Stacks(int size) {
        this.data = new int[size];
    }
    public boolean push(int val) {
        if (pointer == data.length - 1) {
            System.out.println("Stack's full!!!");
            return false;
        }
        pointer++;
        data[pointer] = val;
        return true;
    }
    public int pop() throws Exception{
        if (pointer == -1)
            throw new Exception("Stack's exception");
        return data[pointer--];
    }
    public int peak() throws Exception{
        if (pointer == -1) {
            throw new Exception("Stack's empty");
        }
        return data[pointer];
    }
    public boolean isEmpty() {
        return pointer == -1;
    }

    public static void main(String[] args) throws Exception {
        Stacks stack = new Stacks(5);
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
