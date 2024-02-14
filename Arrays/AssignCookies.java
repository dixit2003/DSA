package Arrays;

import java.util.Arrays;

public class AssignCookies {
    static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;
        int ans = 0;

        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                ans += 1;
                i++;
            }
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] g = {10,9,8,7};
        int[] s = {5,6,7,8};
        System.out.println(findContentChildren(g, s));
    }
}
