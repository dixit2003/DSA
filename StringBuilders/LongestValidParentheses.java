package StringBuilders;

public class LongestValidParentheses {
    static int longest(String s) {
        int open = 0;
        int close = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                open++;
            } else {
                close++;
            }

            if (open == close) {
                int len = open + close;
                max = Math.max(len, max);
            } else if (close > open){
                open = 0;
                close = 0;
            }
        }
        open = 0;
        close = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == '(') {
                open++;
            } else {
                close++;
            }

            if (open == close) {
                int len = open + close;
                max = Math.max(len, max);
            } else if (close < open){
                open = 0;
                close = 0;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(longest(")()()())"));
    }
}
