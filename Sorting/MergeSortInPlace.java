package Sorting;

public class MergeSortInPlace {
    static void mergeSortInPlace(int[] arr, int s, int e) {
        if (e - s == 1)
            return;

        int m = (s + e) / 2;

        mergeSortInPlace(arr, s, m);
        mergeSortInPlace(arr, m, e);

        mergeArrays(arr, s, m, e);
    }
    static void mergeArrays(int[] arr, int s, int m, int e) {
        int[] out = new int[e - s];
        int i = 0;
        int j = 0;
        int k = 0;

        while ((i < m) && (j < e)) {
            if (arr[i] < arr[j]){
                out[k] = arr[i];
                i++;
            }
            else {
                out[k] = arr[j];
                j++;
            }
            k++;
        }
        //It may be possible that one array has extra elements. Copy the remaining elements.
        while (i < m) {
            out[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            out[k] = arr[j];
            j++;
            k++;
        }
        //Modify the original array
        for (int l = 0; l < out.length; l++) {
            arr[s + l] = out[l];
        }
    }

    public static void main(String[] args) {

    }
}
