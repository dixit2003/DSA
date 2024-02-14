package Basics;

import java.util.*;

public class TaskSchedular {
    static int leastInterval(char[] tasks, int n) {
        int[] arr = new int[26];

        for (int i = 0; i < tasks.length; i++) {
            arr[tasks[i] - 'A']++;
        }
        Arrays.sort(arr);

        int maxVal = arr[25] - 1;
        int idleSlots = maxVal * n;

        for (int i = 24; i >= 0; i--) {
            idleSlots -= Math.min(arr[i], maxVal);
        }

        return idleSlots > 0 ? idleSlots + tasks.length : tasks.length;
    }

    public static void main(String[] args) {
        System.out.println(leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2));
    }
}
