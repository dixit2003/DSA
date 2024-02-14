package Implementations.Queues;

import java.util.Stack;

public class QueueUsingStacks {
    private Stack<Integer> first;
    private Stack<Integer> second;
    public QueueUsingStacks() {
        this.first = new Stack();
        this.second = new Stack();
    }

    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int peekEle = second.peek();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return peekEle;
    }
    public boolean empty() {
        return first.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStacks qs = new QueueUsingStacks();
        qs.push(10);
        qs.push(19);
        qs.push(14);

        System.out.println(qs.peek());

    }
}
