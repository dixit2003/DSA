package BinarySearch;

public class MinPeakInMountainArray {
    static int solutions(int[] arr, int target){
        int peak = peakIndex(arr);
        int firstTry = search(arr, target, 0, peak);
        if (firstTry != -1)
            return firstTry;
        else
            return search(arr, target, peak, arr.length - 1);

    }
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
    static int search(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = ((end - start) / 2) + start; //Making sure the sum doesn't exceed INTEGER value

            if (arr[mid] == target)
                return mid;

            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(solutions(arr, 4));

    }
}
