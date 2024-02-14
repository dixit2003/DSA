package StriversSheet.Arrays;

import java.util.Arrays;

public class NextPermutation {
    static void nextPermutation(int[] nums) {
        int breakPoint = -1;
        int revPoint = -1;

        for (int i = nums.length - 1; i >= 0 ; i--) {
            if (i + 1 < nums.length - 1 && nums[i] < nums[i + 1]) {
                breakPoint = i;
                break;
            }
        }
        if (breakPoint == -1) {
            reverse(nums, 0, nums.length - 1);
        }
        else  {
            for (int i = nums.length - 1;  i >= 0 ; i--) {
                if (nums[i] > nums[breakPoint]) {
                    revPoint = i;
                    break;
                }
            }
            swap(nums, breakPoint, revPoint);
            reverse(nums, breakPoint + 1, nums.length - 1);
        }
    }
    static void swap(int[] arr, int p1, int p2) {
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }
    static void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 1, 5, 4, 3, 0, 0};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

}
