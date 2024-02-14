package StringBuilders;

public class RemoveAllOccurrencesOfSubstring {
    static String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.indexOf(part) != -1) {
            int f = sb.indexOf(part);
            int l = f + part.length();
            sb.delete(f, l);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeOccurrences("daabcbaabcbc", "abc"));
    }
}
