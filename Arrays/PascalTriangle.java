package Arrays;

import java.util.*;

public class PascalTriangle {
    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.get(0).add(1);
        for (int i = 1; i < numRows; i++) {
            List<Integer> prev = ans.get(i - 1);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for (int j = 1; j < i; j++) {
                curr.add(prev.get(j - 1) + prev.get(j));
            }
            curr.add(1);
            ans.add(curr);
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
