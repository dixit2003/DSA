package StacksAndQueues.Stacks;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StockSpanProblem {
    public static <Pair> int[] calculateSpan(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i = 0; i < n; i++) {
            while(!st.empty() && arr[i] >= arr[st.peek()]) {
                st.pop();
            }
            if(st.empty()) {
                ans[i] = i + 1;
            }
            else {
                ans[i] = i - st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(calculateSpan(new int[]{100, 80, 60, 70, 60, 75, 85}, 7)));
    }
}
