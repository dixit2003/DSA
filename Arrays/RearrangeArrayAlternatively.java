package Arrays;

import ObjectOrientedProgramming.Interfaces.A;

import java.util.Arrays;

public class RearrangeArrayAlternatively {
    static void rearrange(long arr[], int n){
        long minIndex = 0;
        long maxIndex = n - 1;
        long max = arr[n - 1] + 1;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i] + ((arr[(int) maxIndex] % max) * max); // Condition for placing max's at even indices
                maxIndex -= 1;
            }
            else {
                arr[i] = arr[i] + ((arr[(int) minIndex] % max) * max); // Condition for placing min's at odd index
                minIndex += 1;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] /= max;
        }
    }

    public static void main(String[] args) {
        long[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
        rearrange(arr, 11);
        System.out.println(Arrays.toString(arr));
    }


}
