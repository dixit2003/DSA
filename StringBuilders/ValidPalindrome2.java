package StringBuilders;

public class ValidPalindrome2 {
    static boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }
            else {
                return isPalindrome(s.substring(i, j)) || isPalindrome(s.substring(i + 1, j  + 1));
            }
        }
        return true;
    }
    static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validPalindrome("abc"));
    }
}
