package StacksAndQueues.Stacks;

import java.util.Stack;

public class DecodeString {
    static String decodeString(String s) {
        Stack<Integer> count = new Stack<>();
        Stack<String> result = new Stack<>();

        int i = 0;
        String res = "";

        while (i < s.length()) {
            if (Character.isDigit(s.charAt(i))) {
                int c = 0;
                while (Character.isDigit(s.charAt(i))) {
                    c = 10 * c + (s.charAt(i) - '0');
                    i++;
                }
                count.push(c);
            }
            else if (s.charAt(i) == '[') {
                result.push(res);
                res = "";
                i++;
            }
            else if (s.charAt(i) == ']') {
                StringBuilder sb = new StringBuilder(result.pop());
                int tempCount = count.pop();

                for (int j = 0; j < tempCount; j++) {
                    sb.append(res);
                }
                res = sb.toString();
                i++;
            }
            else {
                res += s.charAt(i);
                i++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(decodeString("3[a2[c]]"));
    }
}
