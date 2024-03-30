package StringBuilders;

public class ZigZagConversion {
    static String convert(String s, int numRows) {
        StringBuilder[] arr = new StringBuilder[numRows];
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            arr[i] = new StringBuilder();
        }

        int i = 0;
        while (i < s.length()) {
            for (int j = 0; j < numRows && i < s.length(); j++) {
                arr[j].append(s.charAt(i++));
            }
            for (int j = numRows - 2; j >= 1 && i < s.length(); j--) {
                arr[j].append(s.charAt(i++));
            }
        }
        for (StringBuilder sb: arr) {
            ans.append(sb);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 4));
    }
}
