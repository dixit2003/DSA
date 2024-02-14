package Softskills;

import java.util.Scanner;

public class AliceApples {
    static int find(int apples) {
        int count = 0;
        int sum = 0;

        while (sum < apples) {
            count++;
            sum += (12 * count * count);
        }
        return 8 * count;
    }

    public static void main(String[] args) {
        System.out.println(find(13));
    }

}
