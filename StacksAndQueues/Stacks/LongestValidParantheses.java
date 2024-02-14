package StacksAndQueues.Stacks;

import java.util.Stack;

public class LongestValidParantheses {
    static int longestValidParantheses(String str) {
        Stack<Integer> stack = new Stack<>();
        int maxLen = 0;
        int start = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(i);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                    if (!stack.isEmpty()) {
                        maxLen = Math.max(maxLen, i - stack.peek());
                    } else {
                        maxLen = Math.max(maxLen, i - start + 1);
                    }
                } else {
                    start = i + 1;
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(longestValidParantheses("(((())()(()"));
    }

}
