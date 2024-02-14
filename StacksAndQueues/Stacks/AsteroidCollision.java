package StacksAndQueues.Stacks;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    static int[] asteroidCollision(int[] arr) {
        Stack<Integer> s = new Stack<>();

        for (int asteroid: arr) {
            if (s.empty() || asteroid > 0) {
                s.push(asteroid);
            } else {
                while (!s.isEmpty() && s.peek() > 0 && s.peek() < Math.abs(asteroid)) {
                    s.pop();
                }

                if (!s.isEmpty() && s.peek() == Math.abs(asteroid)) {
                    s.pop();
                } else if (s.isEmpty() || s.peek() < 0){
                    s.push(asteroid);
                }

            }

        }
        int[] ans = new int[s.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = s.pop();
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(asteroidCollision(new int[]{-4, -1, 10, 2, -1, 8, -9, -6, 5, 2})));
    }
}
