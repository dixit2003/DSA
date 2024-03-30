package RecursionAndDP.Leetcode;

public class KthSymbol {
    static int kthGrammar(int n, int k) {
        return symbolAtK(n, k);
    }

    static int symbolAtK(int n, int k) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return k == 1 ? 0 : 1;
        }

        int mid = (int) Math.pow(2, n - 1) / 2;
        if (k <= mid) {
            return symbolAtK(n - 1, k);
        } else {
            // Invert the result if k is in the second half.
            return 1 - symbolAtK(n - 1, k - mid);
        }
    }

    public static void main(String[] args) {
        System.out.println(kthGrammar(5, 7));
    }
}
