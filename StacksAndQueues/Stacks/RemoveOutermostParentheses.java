package StacksAndQueues.Stacks;

import java.util.Stack;

public class RemoveOutermostParentheses {
    static String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                if (stack.size() >= 1) {
                    ans.append(ch);
                }
                stack.push(ch);
            } else {
                stack.pop();
                if (stack.size() >= 1) {
                    ans.append(')');
                }
            }
        }
        return ans.toString();
    }

    static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            }
            else {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                }
                else {
                    stack.push(ch);
                }
            }

        }
        return stack.size();
    }

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())(()(()))"));
        System.out.println(minAddToMakeValid("()))(("));
    }
}
