package BitManipulation;

import java.util.Arrays;

public class CountBits {

    static int[] countBits(int n) {
        int[] ans = new int[n + 1];
        ans[1] = 1;

        for (int i = 2; i <= n; i++) {
            ans[i] = i % 2 + ans[i / 2];
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));
    }

}
