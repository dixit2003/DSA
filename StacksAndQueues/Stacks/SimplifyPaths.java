package StacksAndQueues.Stacks;

import java.util.Arrays;
import java.util.Stack;

public class SimplifyPaths {
    static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        String[] str = path.trim().split("/");

        for (String ele: str) {
            if (ele.equals(".") || ele.equals("")) {
                continue;
            } else if (ele.equals("..") && !stack.empty()) {
                stack.pop();
            } else if (!ele.equals("..")) {
                stack.push(ele);
            }
        }
        if (stack.empty()) {
            return "/";
        }
        for (String s: stack) {
            if (!s.equals("..")) {
                sb.append("/").append(s);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(simplifyPath("/../"));
    }
}
