package BinarySearch.Leetcode;

public class SearchinRotatedSortedArray {
    static int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;
            if (target == nums[m]) {
                return m;
            }
            if (nums[s] <= nums[m]) {
                if (target >= nums[s] && target <= nums[m]) {
                    e = m - 1;
                }
                else {
                    s = m + 1;
                }
            }
            else {
                if (target >= nums[m] && target <= nums[e]) {
                    s = m + 1;
                }
                else {
                    e = m - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{4, 4, 5, 6, 7, 1, 2, 3}, 5));
    }
}
