package StringBuilders;

public class CustomSortString {
    static String customSortString(String order, String s) {
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < order.length(); i++) {
            int count = arr[order.charAt(i) - 'a'];
            for (int j = 0; j < count; j++) {
                sb.append(order.charAt(i));
                arr[order.charAt(i) - 'a']--;
            }

        }

        for (int i = 0; i < s.length(); i++) {
            if (arr[i] == 1) {
                sb.append((char) (i + 97));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(customSortString("cba", "abcd"));
    }
}
