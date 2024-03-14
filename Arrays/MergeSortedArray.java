package Arrays;

import java.util.Arrays;

public class MergeSortedArray {
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int k = m + n - 1;

        while (p2 >= 0) {
            if (nums2[p2] >= nums1[p1]) {
                nums1[k--] = nums2[p2--];
            }
            else {
                nums1[k--] = nums1[p1--];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}
