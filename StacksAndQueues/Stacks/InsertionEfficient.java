package StacksAndQueues.Stacks;

import java.util.Stack;

public class InsertionEfficient {
    private Stack<Integer> first;
    private Stack<Integer> second;
    public InsertionEfficient() {
        this.first = new Stack<>();
        this.second = new Stack<>();
    }
    public void add(int x) {
        while (!first.empty()) {
            second.push(first.pop());
        }
        first.push(x);
        while (!second.empty()) {
            first.push(second.pop());
        }
    }
    //Removal Efficient
    public int remove() {
        return first.pop() ;
    }
    public int peek() {
        return first.peek();
    }
    public boolean isEmpty() {
        return first.empty();
    }

    public static void main(String[] args) {

    }
}
