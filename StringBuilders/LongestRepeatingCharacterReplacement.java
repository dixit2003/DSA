package StringBuilders;

public class LongestRepeatingCharacterReplacement {
    static int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0;
        int maxFreq = Integer.MIN_VALUE;
        int res = 0;

        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            if (right - left + 1 - maxFreq <= k) {
                res = Math.max(res, right - left + 1);
            }
            else {
                freq[s.charAt(left) - 'A']--;
                left++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(characterReplacement("AABABBA", 1));
    }
}
