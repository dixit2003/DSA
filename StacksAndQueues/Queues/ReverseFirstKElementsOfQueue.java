//package StacksAndQueues.Queues;
//
//import java.util.*;
//
//public class ReverseFirstKElementsOfQueue {
//    static Queue<Integer> reverseQueue(Queue<Integer> q, int k) {
//        Stack<Integer> s1 = new Stack<>();
//        for (int i = 0; i < k; i++) {
//            int element = q.front();
//            s1.push(element);
//            q.dequeue();
//        }
//        while (!s1.isEmpty()) {
//            q.enqueue(s1.pop());
//        }
//        for (int i = k; i < q.size() - k; i++) {
//            int element = q.front(i);
//            q.enqueue(element);
//            q.dequeue();
//        }
//        return q;
//
//    }
//}
