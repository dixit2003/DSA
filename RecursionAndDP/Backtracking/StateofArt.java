package Recursions.Backtracking;

public class StateofArt {

    static int count(int n, int k) {
        return countHelper(n, 1, k);
    }

    static int countHelper(int n, int current, int k) {
        if (current > n) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }
        return countHelper(n, current + 1, k) + countHelper(n, current + 1, k - 1);
    }

    public static void main(String[] args) {
        System.out.println(count(5, 3));
    }
}
