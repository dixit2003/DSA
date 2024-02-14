package StacksAndQueues.Stacks;

import java.util.Stack;

public class Example1 {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(3);
        s1.push(4);
        s1.push(5);
        s1.push(6);
        s1.push(7);
        s1.push(8);


        System.out.println(s1.pop());
        System.out.println(s1.pop());

        System.out.println(s1.peek()); //Returns last element


        s1.peek();



    }
}
