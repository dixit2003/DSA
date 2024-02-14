package BitManipulation;

public class SingleNumber2 {
    static int singleNumber(int[] nums) {
        int ans = 0;

        for (int i = 0; i < 32; i++) {
            int mask = 1 << i;
            int ones = 0;

            for (int ele : nums) {
                if ((ele & mask) != 0) {
                    ones++;
                }
            }
            if (ones % 3 == 1) {
                ans |= 1 << i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{0, 1, 0, 1, 0, 1, 99}));
    }
}
