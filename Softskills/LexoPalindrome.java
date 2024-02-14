package Softskills;

public class LexoPalindrome {
    static String palindrome(String str) {
        int len = str.length();
        int[] alps = new int[26];

        for (int i = 0; i < str.length(); i++) {
            alps[str.charAt(i) - 'a']++;
        }

        if (!freqDetails(alps, str.length())) {
            return "Not a palindrome";
        }
        StringBuilder fh = new StringBuilder();
        StringBuilder mid = new StringBuilder();

        for (int i = 0; i < alps.length; i++) {
            if (alps[i] % 2 != 0) {
                mid.append((char) (i + 'a'));
            }
        }

        for (int i = 0; i < alps.length; i++) {
            char ch = (char) (i + 'a');
            for (int j = 0; j < alps[i] / 2; j++) {
                fh.append(ch);
            }
        }
        StringBuilder ans = new StringBuilder();
        ans.append(fh);
        ans.append(mid);
        ans.append(fh.reverse());

        return String.valueOf(ans);
    }

    static boolean freqDetails(int[] alps, int len) {
        int oddCount = 0;
        for (int ele: alps) {
            if (ele % 2 != 0) {
                oddCount++;
            }
        }
        if (len % 2 == 0) {
            return oddCount == 0;
        } else {
            return oddCount == 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(palindrome("malayalam"));
    }
}
