package StacksAndQueues.Stacks;

import java.util.Stack;

public class RemovalEfficient {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public RemovalEfficient() {
        this.first = new Stack<>();
        this.second = new Stack<>();
    }
    //Insertion Efficient
    public void add(int x) {
        first.push(x);
    }
    //Removal Efficient
    public int remove() {
        while (!first.empty()) {
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!second.empty()) {
            first.push(second.pop());
        }
        return removed;
    }
    public int peek() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int peeked =  second.peek();
        while (!second.empty()) {
            first.push(second.pop());
        }
        return peeked;
    }
    public boolean isEmpty() {
        return first.empty();
    }
}
