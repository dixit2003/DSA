package BitManipulation;

import java.util.Arrays;

public class SingleElement3 {
    static int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int ele: nums) {
            xor ^= ele;
        }
        int differBit = 0;

        while (xor != 0) {
            if ((xor & 1) == 1) {
                break;
            }
            differBit++;
            xor >>= 1;
        }
        int ele1 = 0;
        int ele2 = 0;
        int mask = 1 << differBit;

        for (int ele: nums) {
            if ((ele & mask) != 0)
                ele1 ^= ele;
            else
                ele2 ^= ele;
        }
        return new int[]{ele1, ele2};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(singleNumber(new int[]{1, 2, 1, 3, 2, 5})));
    }
}
