package Implementations.Stacks;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> q;
    public StackUsingQueue() {
        this.q = new LinkedList<>();
    }
    public void push(int x) {
        q.offer(x);
    }

    public int pop() {
        int size = q.size();
        int popEle = 0;
        while (size > 0) {
            if (size == 1) {
                popEle = q.poll();
                break;
            }
            q.offer(q.poll());
            size--;
        }
        return popEle;
    }

    public int top() {
        int size = q.size();
        int top = 0;
        while (size > 0) {
            if (size == 1) {
                top = q.peek();
            }
            q.offer(q.poll());
            size--;
        }
        return top;
    }

    public boolean empty() {
        return q.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueue sq = new StackUsingQueue();
        sq.push(10);
        sq.push(20);
        sq.push(30);
        sq.push(40);
        sq.push(50);

        System.out.println(sq.top());
    }
}
