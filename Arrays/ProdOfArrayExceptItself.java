package Arrays;

import java.util.Arrays;

public class ProdOfArrayExceptItself {
    public int[] productExceptSelf(int[] nums) {
        boolean zeroPresence = false;
        int prod = 1;
        int zeroCount = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zeroPresence = true;
                zeroCount++;
            }
        }

        if (!zeroPresence) {
            for (int i = 0; i < n; i++) {
                prod *= nums[i];
            }

            for (int i = 0; i < n; i++) {
                nums[i] = prod / nums[i];
            }
            return nums;
        }
        else {
            if (zeroCount == 1) {
                for (int i = 0; i < n; i++) {
                    if (nums[i] != 0) {
                        prod *= nums[i];
                    }
                }

                for (int i = 0; i < n; i++) {
                    if (nums[i] != 0) {
                        nums[i] = 0;
                    }
                    else {
                        nums[i] = prod;
                    }
                }
                return nums;
            }
            else {
            }

        }
        return nums;

    }
}
