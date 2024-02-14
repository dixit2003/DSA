package StacksAndQueues.Stacks;

public class DynamicStack extends Stack {
    public DynamicStack() {
        super();
    }
    public DynamicStack(int size) {
        super();
    }

    @Override
    public boolean push(int item) {
        if (pointer == data.length - 1) {
            int[] temp = new int[2 * data.length];

            System.arraycopy(data, 0, temp, 0, data.length);
            data = temp;
        }
        //Here the array is not full. Simply insert the item
        return super.push(item);
    }

    public static void main(String[] args) throws StackExceptions {
        Stack stack = new DynamicStack(5);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        stack.push(16);
        stack.push(17);
        stack.push(20);
        stack.push(23);
        stack.push(28);

        System.out.println(stack.peak());
    }
}
