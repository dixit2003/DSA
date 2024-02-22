package Arrays;

import java.util.Arrays;

public class IntersectionOfTwoArrays1 {
    static int[] intersection(int[] nums1, int[] nums2) {
        int[] temp = new int[1001];
        for (int ele: nums1) {
            if (temp[ele] != 1) {
                temp[ele]++;
            }
        }
        int count = 0;
        for (int ele: nums2) {
            if (temp[ele] == 1) {
                temp[ele]++;
                count++;
            }
        }
        int idx = 0;
        int[] ans = new int[count];
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > 1) {
                ans[idx] = i;
                idx++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }
}
