package RecursionAndDP;

public class BinarySearchUsingRecursion {
    static int binarySearch(int[] arr, int t, int s, int e) {

        if (s > e)
            return -1;

        int m = s + ((e - s) / 2);
        if (arr[m] == t)
            return m;

        if (t < arr[m])
            return binarySearch(arr, t, s, m - 1);
        else
            return binarySearch(arr, t, m + 1, e);
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 9, 11, 12, 15, 17, 18, 20, 21, 23, 24, 26, 30};
        System.out.println(binarySearch(arr, 24, 0, arr.length));
    }
}
