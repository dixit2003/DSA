package StacksAndQueues.Stacks;

import java.util.Objects;
import java.util.Stack;

public class EvaluateReversePolishNotation {
    static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        int ans = 0;
        for (String c : tokens) {
            if (isNumber(c)) {
                stack.push(Integer.parseInt(c));
            } else {
                int top1 = stack.pop();
                int top2 = stack.pop();

                int x = 0;

                if (Objects.equals(c, "+")) {
                    x = top2 + top1;
                } else if (Objects.equals(c, "-")) {
                    x = top2 - top1;
                } else if (Objects.equals(c, "/")) {
                    x = top2 / top1;
                } else if (Objects.equals(c, "*")) {
                    x = top2 * top1;
                }
                stack.push(x);
            }
        }
        return stack.peek();
    }

    static boolean isNumber(String s) {
        try {
            // Attempt to parse the string as a double
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            // If an exception is caught, it's not a number
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"4","-2","/","2","-3","-","-"}));
    }
}