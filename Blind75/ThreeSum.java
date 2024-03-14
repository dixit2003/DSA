package Blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int start;
        int end;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] != nums[i - 1]) {
                start = i + 1;
                end = nums.length - 1;

                int ele1 = nums[i];
                while (start < end) {
                    int target = ele1 + nums[start] + nums[end];
                    if (target == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(ele1);
                        list.add(nums[start]);
                        list.add(nums[end]);

                        ans.add(list);
                        start++;
                        end--;
                    }
                    else if (target > 0) {
                        end--;
                    }
                    else {
                        start++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
