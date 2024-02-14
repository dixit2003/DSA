package StacksAndQueues.Stacks;

import java.util.*;

public class MinStack {
    int val;
    int min = Integer.MAX_VALUE;

    List<Integer> list;
    List<Integer> minList;

    public MinStack() {
        list = new ArrayList<>();
        minList = new ArrayList<>();
        minList.add(min);
    }

    public void push(int val) {
        if (val <= minList.get(minList.size() - 1)) {
            minList.add(val);
        }
        list.add(val);
    }

    public void pop() {
        int removed = list.remove(list.size() - 1);
        if (minList.get(minList.size() - 1) == removed) {
            minList.remove(minList.size() - 1);
        }
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public int getMin() {
        return minList.get(minList.size() - 1);
    }
}
