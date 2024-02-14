package Recursions.Permutations;

import java.util.ArrayList;

public class stringPermutations {
    static void permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch =  up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            permutations(f + ch + s, up.substring(1));
        }
    }
    static ArrayList<String> permutations1(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        //Local to that function call.
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            ans.addAll(permutations1(f + ch + s, up.substring(1)));
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<String> ans = permutations1("", "AAB");
        System.out.println(ans);
    }
}
