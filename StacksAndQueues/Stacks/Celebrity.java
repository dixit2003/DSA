package StacksAndQueues.Stacks;

import java.util.Stack;

public class Celebrity {
    static int celebrity(int[][] arr, int n) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            stack.push(i);
        }

        while (stack.size() > 1) {
            int top1 = stack.pop();
            int top2 = stack.pop();

            if (arr[top1][top2] == 0) {
                stack.push(top1);
            } else if (arr[top2][top1] == 0) {
                stack.push(top2);
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[stack.peek()][i] == 1) {
                return -1;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i != stack.peek() && arr[i][stack.peek()] == 0) {
                return -1;
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        System.out.println(celebrity(new int[][]{{0, 1, 0}, {0, 0, 0}, {0, 1, 0}}, 3));
    }
}
