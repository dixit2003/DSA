public class ValidParanthesisCombinations {
    static int combos(int n, int x) {
        if (n == 0 && x == 0)
            return 1;
        if (n % 2 == 1 && x == 0)
            return 0;
        

        int[][] dp = new int[n + 1][x + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= x; j++) {
                dp[i][j] += dp[i - 1][j];

                if (j >= i)
                    dp[i][j] += dp[i - 1][j + i];
            }
        }
        return dp[n][x];
    }

    public static void main(String[] args) {
        System.out.println(combos(4, 2));
    }
}
