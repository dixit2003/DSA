package BitManipulation;

public class ReverseBits {
    static int reverseBits(int n) {
        int reversed = 0;
        while (n > 0) {
            reversed = reversed << 1;
            if ((int)(n & 1) == 1)
                reversed ^= 1;
            n = n >> 1;
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverseBits(53));
    }
}
