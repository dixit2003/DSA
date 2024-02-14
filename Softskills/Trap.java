package Softskills;

import java.util.ArrayList;
import java.util.List;

public class Trap {
    static int leftOut(List<Integer> list, int k, int i) {
        if (list.size() == 1) {
            return list.get(0);
        }
        int l = (i + k - 1) % list.size();
        list.remove(l % list.size());
        return leftOut(list, k, l);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(leftOut(list, 5, 0));
    }
}
