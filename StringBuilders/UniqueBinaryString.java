package StringBuilders;

import java.util.*;

public class UniqueBinaryString {
    static String findUnique(String[] arr) {
        Set<Integer> set = new HashSet<>();
        String ans = null;

        for (String s : arr) {
            set.add(Integer.parseInt(s, 2));
        }
        int n = arr.length;
        for (int i = 0; i <= n; i++) {
            if (!set.contains(i)) {
                return String.format("%" + n + "s", Integer.toBinaryString(i)).replace(' ', '0');
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(findUnique(new String[]{"111", "011", "001"}));
    }
}
