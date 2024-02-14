package BinarySearch.Leetcode;

public class SingleElement {
    static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + ((end - start) / 2);

            if (mid % 2 == 0) {
                mid--;
            }

            if (nums[mid] == nums[mid - 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return nums[end];

    }

    public static void main(String[] args) {
        System.out.println(singleNonDuplicate(new int[]{3,3,7,7,10,11,11}));
    }
}
