package StringBuilders;

public class CompareVersionNumbers {
    static int compareVersion(String s1, String s2) {
        int v1 = 0;
        int v2 = 0;

        while (v1 < s1.length() || v2 < s2.length()) {
            int a = 0;
            int b = 0;

            while (v1 < s1.length() && s1.charAt(v1) != '.') {
                a = a * 10 + s1.charAt(v1) - '0';
                v1++;
            }
            v1++;

            while (v2 < s2.length() && s2.charAt(v2) != '.') {
                b = b * 10 + s2.charAt(v2) - '0';
                v2++;
            }
            v2++;

            if (a > b) return 1;
            else if (a < b) return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(compareVersion("1.0", "1.0.0"));
    }
}
