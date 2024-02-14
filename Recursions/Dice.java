package Recursions;

import java.util.ArrayList;
public class Dice {
    static ArrayList dice(String p, int t) {
        if (t == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> combos = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            combos.addAll(dice(p + i, t - i));
        }
        return combos;
    }

    public static void main(String[] args) {
        System.out.println(dice("", 5));
    }
}
