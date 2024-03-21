package Miscellaneous;

public class TimeAtPosition {
    static int timeAtPosition(int n, int i, int j) {
        if (i == 0 && j == 0) {
            return 1;
        }
        if (i == n - 1 && j == n - 1) {
            return (int) Math.pow(n, 2);
        }
        return timeAtPositionHelper(n, i, j, true);
    }
    static int timeAtPositionHelper(int n, int i, int j, boolean flag) {
        int res = 0;
        int r = 0;
        int c = 0;

        while (r < n && c < n) {
            if (r == i && c == j) return res + 1;

            if (flag) {
                res++;

                if (r + 1 >= n) {
                    c++;
                    flag = false;
                    continue;
                }
                else if (c - 1 < 0) {
                    r++;
                    flag = false;
                    continue;
                }
                r++;
                c--;
            }
            else {
                res++;

                if (c + 1 >= n) {
                    r++;
                    flag = true;
                    continue;
                }
                else if (r - 1 < 0) {
                    c++;
                    flag = true;
                    continue;
                }
                r--;
                c++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(timeAtPosition(5, 4, 2));
    }
}
