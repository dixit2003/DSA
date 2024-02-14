package BinarySearch;

import java.util.Arrays;

public class FairCandySwap {
    static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sa = 0;
        int sb = 0;

        for (int i: aliceSizes) {
            sa += i;
        }
        for (int j: bobSizes) {
            sb += j;
        }
        int delta = (sa - sb) / 2;

        for(int b: bobSizes) {
            if (binarySearch(aliceSizes, b + delta) != -1){
                return new int[] {b + delta, b};
            }
        }
        return null;
    }
    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = ((end - start) / 2) + start;

            if (arr[mid] == target) {
                return arr[mid];
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fairCandySwap(new int[]{1, 2, 5}, new int[]{2, 4})));
    }
}
