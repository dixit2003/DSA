package Softskills;

import java.util.Arrays;

public class Majority {
    static int mooresAlgo(int[] arr) {
        int ele = arr[0];
        int count = 1;

        int i = 1;
        while (i < arr.length) {
            if (arr[i] != ele) {
                count--;
            }
            else {
                count += 1;
            }

            if (count == 0) {
                ele = arr[i];
                count = 1;
            }
            i += 1;
        }

        int eleCount = 0;
        for (int e: arr) {
            if (e == ele) {
                eleCount++;
            }
        }
        if (eleCount > arr.length / 2) {
            return ele;
        }
        else {
            return Integer.MIN_VALUE;
        }
    }
    static char findTheDifference(String s, String t) {
        int num = 0;
        for(int ch : t.toCharArray()) {
            num += ch;
        }
        for(int ch : s.toCharArray()) {
            num -= ch;
        }
        return (char) (num);
    }

    public static void main(String[] args) {
        System.out.println(mooresAlgo(new int[]{7, 5, 7, 7, 3, 7, 10, 7, 7, 7, 8, 9, 7}));
    }
}
