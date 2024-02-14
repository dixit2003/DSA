package StacksAndQueues.Stacks;

import java.util.Stack;
public class RemoveAdjacentDuplicates {
    static String removeDuplicates(String s) {
        Stack<Character> s1 = new Stack<>();
        s1.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s1.isEmpty() || ch != s1.peek()) {
                s1.push(ch);
            }
            else {
                s1.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!s1.isEmpty()) {
            sb.append(s1.pop());
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbacx"));
    }

}
