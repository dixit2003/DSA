package RecursionAndDP.Sorting;

import java.util.Arrays;

public class MergeSort {
    static int[] sort(int[] arr) {
        if (arr.length == 1)
            return arr;

        int mid = arr.length / 2;
        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }
    static  int[] merge(int[] arr1, int[] arr2) {
        int[] out = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while ((i < arr1.length) && (j < arr2.length)) {
            if (arr1[i] < arr2[j]) {
                out[k] = arr1[i];
                i++;
            }
            else {
                out[k] = arr2[j];
                j++;
            }
            k++;
        }
        //It may be possible that one of the arrays is not complete. Copy the remaining element. Any one of the below two conditions is possible.
        while (i < arr1.length) {
            out[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            out[k] = arr2[j];
            j++;
            k++;
        }
        return out;
    }

    public static void main(String[] args) {
        int[] arr = {7, 4, 3, 6, 1, 2, 11, 8, 5};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
