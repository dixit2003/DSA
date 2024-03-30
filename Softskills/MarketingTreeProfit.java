package Softskills;

public class MarketingTreeProfit {
    static int rootProfit(int n, int m, int p) {
        int profit = 0;
        for (int i = 0; i < n - 1; i++) {
            profit = (m * p) / 100;
            m = (m * p) / 100;
        }
        return profit;
    }
    static int rootProfit2(int n, int m, int p) {
        if (n == 1) {
            return m;
        }
        return rootProfit2(n - 1, (m * p) / 100, p);
    }

    public static void main(String[] args) {
        System.out.println(rootProfit2(4, 2000, 50));
    }
}
