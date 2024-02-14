package Softskills;

import java.util.ArrayList;

public class Euclid {
    static int gcd(int n1, int n2) {
        if (n1 == 0) {
            return n2;
        }
        return gcd(n2 % n1, n1);
    }

    public static void main(String[] args) {
//        System.out.println(gcd(25, 150));
        int[] arr = {2, 4, 7 ,8};
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println(i);
            }
        }
        System.out.println(-1);



    }
}
