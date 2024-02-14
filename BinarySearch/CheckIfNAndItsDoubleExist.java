package BinarySearch;

import java.util.*;
public class CheckIfNAndItsDoubleExist {
    static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int res;
        for (int i = 0; i < arr.length; i++) {
            res = binarySearch(arr[i] * 2, arr);
            if (res != i && res != -1) {
                return true;
            }
        }
        return false;
    }
    static int binarySearch(int ele, int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] < ele) {
                start = mid + 1;

            } else if (arr[mid] > ele) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[]{10, 2, 5, 3}));
    }
}
