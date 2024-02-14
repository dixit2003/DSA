package StringBuilders;

public class ReverseWordsInAString {
    static String reverseWords(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            int si = i;
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            String word = s.substring(i + 1, si + 1);
            if (word.equals("")) continue;
            sb.append(word).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }
}
