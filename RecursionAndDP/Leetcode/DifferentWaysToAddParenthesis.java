package RecursionAndDP.Leetcode;

import java.util.*;

public class DifferentWaysToAddParenthesis {
    static List<Integer> diffWaysToCompute(String s) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '*' || c == '-' || c == '+') {
                String a = s.substring(0, i);
                String b = s.substring(i + 1);

                List<Integer> left = diffWaysToCompute(a);
                List<Integer> right = diffWaysToCompute(b);

                for (int x: left) {
                    for (int y: right) {
                        if (c == '*') {
                            res.add(x * y);
                        } else if (c == '-') {
                            res.add(x - y);
                        } else {
                            res.add(x + y);
                        }
                    }
                }

            }

        }
        if (res.size() == 0) {
            res.add(Integer.valueOf(s));
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(diffWaysToCompute("2*3-4*5"));
    }
}
