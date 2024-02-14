package Arrays;

public class JumpGame2 {
    static int minJumps(int[] arr) {
        int flag = 0;
        int lastIndex = 0;
        int dest = arr.length - 1;
        int jumps = 0;
        for (int i = 0; i < arr.length; i++) {
            flag = Math.max(flag, i + arr[i]);

            if (i == lastIndex) {
                lastIndex = flag;
                jumps++;

                if (flag >= dest) {
                    return jumps;
                }

            }
        }
        return jumps;
    }

    public static void main(String[] args) {
        System.out.println(minJumps(new int[]{2,4,1,2,3,1,1,2}));
    }
}
