package StringBuilders;

public class StringCompression {
    static int compress(char[] chars) {
        if (chars.length <= 1)
            return chars.length;

        int count = 1;
        StringBuilder compressedString = new StringBuilder();
        compressedString.append(chars[0]);

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                if (count > 1) {
                    compressedString.append(count);
                }
                compressedString.append(chars[i]);
                count = 1;
            }
        }

        if (count > 1) {
            compressedString.append(count);
        }

        return compressedString.length();
    }

    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c'}));
    }
}
