package Recursions.SubSequences;

import java.util.ArrayList;

public class Subseq {
    static void printSubseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        printSubseq(p + ch, up.substring(1));
        printSubseq(p, up.substring(1));

    }
    static ArrayList listSubseq(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = listSubseq(p + ch, up.substring(1));
        ArrayList<String> right = listSubseq(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
        System.out.println(listSubseq("", "AAB"));
    }
}
