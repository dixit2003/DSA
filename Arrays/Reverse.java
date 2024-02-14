package Arrays;

import java.util.Arrays;

public class Reverse {
    static void ReverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start += 1;
            end -= 1;
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        ReverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
