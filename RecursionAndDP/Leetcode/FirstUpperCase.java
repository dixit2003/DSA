package Recursions.Leetcode;

public class FirstUpperCase {
    static char firstUpperCaseChar(String str) {
        return findChar(str, 0);
    }
    static char findChar(String str, int i) {
        if (i == str.length()) {
            return 0;
        }
        if (Character.isUpperCase(str.charAt(i))) {
            return str.charAt(i);
        }
        return findChar(str, i + 1);
    }

    public static void main(String[] args) {
        System.out.println(firstUpperCaseChar("geeKs"));
    }
}
