package Softskills;/*
    Time Complexity : O(N ^ (1/2))
    Space Complexity : O(N ^ (1/2))
  
    Where 'N' is the number of bulbs in the room.
*/

import java.util.Arrays;

public class ToggleSwitch {
    public static boolean[] toggleBulbs(int n) {
        boolean[] b = new boolean[n + 1];
        int num = 1;

        // Pushing perfect square numbers to ArrayList that are less than 'N'.
        while ((num * num) <= n){
            b[num * num] = true;
            num++;
        }
        return Arrays.copyOfRange(b, 1, b.length + 1);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(toggleBulbs(20)));
    }
}