package Softskills;

public class ChineaseRemainerTheorem {
    static int theorem(int[] nums, int[] rem, int k) {
        int x = 1;

        while (true) {
            int j;
            for (j = 0; j < k; j++) {
                if (x % nums[j] != rem[j]) {
                    break;
                }
            }
            if (j == k) {
                return x;
            }
            x++;
        }
    }

    public static void main(String[] args) {
        System.out.println(theorem(new int[]{3, 4, 5}, new int[]{2, 3, 2}, 3));
    }
}
