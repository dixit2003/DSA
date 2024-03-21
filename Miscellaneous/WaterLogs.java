package Miscellaneous;

public class WaterLogs {
    static int count(int n, int l, int r, int[] arr) {
        int res = 1;
        for (int i = 0; i < n; i++) {
            int left = i + 1 < arr.length ? arr[i] - arr[i + 1] : 0;
            int right = i - 1 >= 0 ? arr[i] - arr[i - 1] : 0;

            if (i + 1 < arr.length && arr[i + 1] >= arr[i]) {
                res++;
                continue;
            }

            if (right <= r && left <= l) {
                res++;
                arr[i] -= left;
            }
            else {
                break;
            }
        }
        return res > arr.length ? res : res * 2;
    }

    public static void main(String[] args) {
        System.out.println(count(5, 1, 5, new int[]{7, 6, 5, 7, 1, 3}));
    }
}
