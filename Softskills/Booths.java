package Softskills;

public class Booths {
    static int boothsAlgo(int n1, int n2) {
        int r = n2;
        int A = n1;
        int P = 0;
        int l1 = Integer.toBinaryString(n1).length();
        int l2 = Integer.toBinaryString(n2).length();

        int l = Math.max(l1, l2);
        while (l > 0) {
            if ((r & 1) == 1)
                P += A;
            A <<= 1;
            l--;
            r >>= 1;
        }
        return P;
    }

    public static void main(String[] args) {
        System.out.println(boothsAlgo(100, 7));  // Expected: 15
        System.out.println(boothsAlgo(-7, -3)); // Expected: 21
    }
}
