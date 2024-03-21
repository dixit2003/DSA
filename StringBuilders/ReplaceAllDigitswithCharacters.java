package StringBuilders;
public class ReplaceAllDigitswithCharacters {
    static String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder(s);

        int i = 0;
        while (i < s.length()) {
            if (i + 1 < s.length()) {
                int num = s.charAt(i + 1) - '0' + 97;
                sb.setCharAt(i + 1, (char)(num + s.charAt(i) - 'a'));
            }
            i += 2;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceDigits("a1b2c3d4e"));
    }
}
