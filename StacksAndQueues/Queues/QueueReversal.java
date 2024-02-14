package StacksAndQueues.Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal {
    static Queue<Integer> rev(Queue<Integer> q){
        Stack<Integer> stack = new Stack<>();
        int size = q.size();
        for (int i = 0; i < size; i++) {
            stack.add(q.poll());
        }
        for (int i = 0; i < size; i++) {
            q.add(stack.pop());
        }
        return q;
    }
    static Queue<Integer> revKElements(Queue<Integer> q, int k) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            stack.add(q.poll());
        }
        for (int i = 0; i < k; i++) {
            q.add(stack.pop());
        }
        return q;
    }
    static Queue<Integer> interleave(Queue<Integer> q) {
        Queue<Integer> helper = new LinkedList<>();
        int size = q.size();

        for (int i = 0; i < size / 2; i++) {
            helper.add(q.poll());
        }
        for (int i = 0; i < size / 2; i++) {
            q.add(helper.poll());
            q.add(q.poll());
        }
        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
//
        System.out.println(rev(q));
        System.out.println(revKElements(q, 2));
        System.out.println(interleave(q));
    }
}
