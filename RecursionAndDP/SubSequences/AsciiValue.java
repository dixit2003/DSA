package RecursionAndDP.SubSequences;

import java.util.ArrayList;

public class AsciiValue {
    static ArrayList printSubseq(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = printSubseq(p + ch, up.substring(1));
        ArrayList<String> second = printSubseq(p, up.substring(1));
        ArrayList<String> third = printSubseq(p + (ch + 0), up.substring(1));

        first.addAll(second);
        first.addAll(third);

        return first;
    }

    public static void main(String[] args) {
        System.out.println(printSubseq("", "ab"));
    }

}
