package BinarySearch;

public class peakIndexInMountainArray {
    static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(peakIndex(arr));
    }
}
