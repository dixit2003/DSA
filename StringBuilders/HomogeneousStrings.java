package StringBuilders;

public class HomogeneousStrings {
    final static int MOD = 1_000_000_007;
    static int countHomogenous(String s) {
        long ans = 0;

        for (int i = 0; i < s.length(); ) {
            int count = 0;
            char ch = s.charAt(i);

            while (i < s.length() && s.charAt(i) == ch) {
                count++;
                i++;
            }
            ans += ((long) count * (count + 1) / 2) % MOD;
        }
        return (int) (ans % MOD);

    }

    public static void main(String[] args) {
        System.out.println(countHomogenous("abbcccaa"));
    }
}
