package StacksAndQueues.Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Example1 {

    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();

        q1.add(3);
        q1.add(6);
        q1.add(9);
        q1.add(10);
        q1.add(15);
        q1.add(17);

        System.out.println(q1.peek());

        System.out.println(q1.remove());

        System.out.println(q1.remove());

        //Can insert and delete from start and end.

        Deque<Integer> d1 = new ArrayDeque<>();

        d1.add(10);
        d1.add(12);
        d1.remove();



    }
}
