package StringBuilders;

public class AddBinary {
    static String addBinary(String a, String b) {
        int carry = 0;
        StringBuilder binary = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0) {
                carry += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                carry += b.charAt(j--) - '0';
            }
            binary.append(carry % 2);
            carry /= 2;
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("1001", "1101"));
    }

}
