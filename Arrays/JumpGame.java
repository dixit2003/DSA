package Arrays;

public class JumpGame {
    static boolean canJump(int[] nums) {
        int finalIndex = nums.length - 1;
        int pre = finalIndex - 1;

        while (pre >= 0) {

            if (nums[pre] > 0 && finalIndex - pre <= nums[pre]) {
                finalIndex = pre;
                pre--;
            } else {
                pre--;

            }
        }
        return finalIndex == 0;
    }

    public static void main(String[] args) {
        System.out.println(canJump(new int[]{1,1,2,5,2,1,0,0,1,3}));
    }
}
