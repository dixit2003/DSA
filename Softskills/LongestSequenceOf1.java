package Softskills;

import java.util.Scanner;

public class LongestSequenceOf1 {
    static int longestSequence(int n) {
        String binary = Integer.toBinaryString(n);
        int count = 0;
        int max = -1;

        for (char c: binary.toCharArray()) {
            if (c == '1') {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }

        }
        return max;
    }
    static int longSequenceAfterFlip(int n) {
        String binary = Integer.toBinaryString(n);
        int maxLength = -1;
        int curr = 0;
        int prev = 0;

        for (char ch: binary.toCharArray()) {
            if (ch == '1') {
                curr++;
            } else {
                maxLength = Math.max(maxLength, curr + prev + 1);
                prev = curr;
                curr = 0;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(longSequenceAfterFlip(1051024));
    }
}
