package Sorting;

public class QuickSort {
    static void quickSort(int[] arr, int low, int high) {
        if (low >= high)
            return;

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int p = arr[mid];

        while (start <= end) {
            while (arr[start] < p) {
                start++;
            }while (arr[end] > p) {
                end--;
            }
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            quickSort(arr, low, end);
            quickSort(arr, start, high);
        }
    }

    public static void main(String[] args) {

    }
}
