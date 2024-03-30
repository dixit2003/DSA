package RecursionAndDP.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
    static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        combinationSum3Helper(k, n, new ArrayList<>(), ans, 1);
        return ans;
    }
    static void combinationSum3Helper(int k, int n, List<Integer> list, List<List<Integer>> ans, int i) {
        if (k == 0 && n == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        else if (k == 0 || n <= 0 || i > 9){
            return;
        }

        list.add(i);
        combinationSum3Helper(k - 1, n - i, list, ans,i + 1);
        list.remove(list.size() - 1);
        combinationSum3Helper(k, n, list, ans, i + 1);
    }

    public static void main(String[] args) {
        System.out.println(combinationSum3(3, 9));
    }
}
