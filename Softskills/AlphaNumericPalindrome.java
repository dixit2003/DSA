package Softskills;

public class AlphaNumericPalindrome {
    static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder();
        str = str.toLowerCase();

        for (int i = str.length() - 1; i >= 0; i--) {
            if (Character.isAlphabetic(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
        }
        int i = 0;
        int j = sb.length() - 1;
        while (i <= j) {
            if (sb.charAt(i) != sb.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal : Panama"));
    }
}
