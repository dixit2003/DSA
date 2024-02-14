package BitManipulation;

public class SingleElement1 {
    static int singleNumber(int[] nums) {
        int xor = 0;
        for (int ele: nums) {
            xor ^= ele;
        }
        return xor;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
    }
}
