package Softskills;


import java.util.Arrays;

public class Sieve {
    static void sieve(int n) {
        boolean[] p = new boolean[n + 1];
        Arrays.fill(p, true);

        for (int j = 2; j * j <= n ; j++) {
            if (p[j]) {
                for (int k = j * j; k <= n; k += j) {
                    p[k] = false;
                }
            }

        }
        for (int l = 2; l <= n; l++) {
            if (p[l]) {
                System.out.print(l + " ");
            }
        }
    }
    static void segmentSieve(int l, int h) {
        boolean[] p = new boolean[h + 1];
        Arrays.fill(p, true);

        for (int j = 2; j * j <= h ; j++) {
            if (p[j]) {
                for (int k = j * j; k <= h; k += j) {
                    p[k] = false;
                }
            }
        }
        for (int z = l; z <= h; z++) {
            if (p[z]) {
                System.out.print(z + " ");
            }
        }
    }

    public static void main(String[] args) {
//        sieve(15);
        segmentSieve(20, 50);
    }
}
