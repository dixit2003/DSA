package Arrays;

import java.util.Arrays;

public class NUnique {
    static int[] sumZero(int n) {
        int[] ans = new int[n];

        for (int i = 0; i < n / 2; i++) {
            ans[i] = i + 1;
            ans[n - i - 1] = -1 * (i + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(7)));
    }
}
