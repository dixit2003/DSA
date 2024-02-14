package StacksAndQueues.Stacks;

import java.util.Stack;

public class ValidParentheses {
    static boolean isValid(String str) {
        Stack<Character> s1 = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                s1.push(ch);
            }
            else {
                if (ch == ')') {
                    if (s1.isEmpty() || s1.pop() != '(') {
                        return false;
                    }
                } else if (ch == ']') {
                    if (s1.isEmpty() || s1.pop() != '[') {
                        return false;
                    }
                } else if (ch == '}') {
                    if (s1.isEmpty() || s1.pop() != '{') {
                        return false;
                    }
                }
            }
        }
        return s1.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("(({{}}))"));
    }

}
