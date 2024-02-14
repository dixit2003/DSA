package SlidingWindow;

public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        int[] charFrequency = new int[128];

        // Initialize character frequency for string t
        for (char c : t.toCharArray()) {
            charFrequency[c]++;
        }

        int left = 0;
        int right = 0;
        int start = 0;
        int minLength = Integer.MAX_VALUE;
        int count = t.length();

        char[] sChars = s.toCharArray();

        while (right < sChars.length) {
            // Expand the window
            char currentChar = sChars[right++];
            charFrequency[currentChar]--;

            if (charFrequency[currentChar] > 0) {
                count--;
            }

            // Contract the window
            while (count == 0) {
                // Update the minimum length and starting index of the window
                if (minLength > right - left) {
                    start = left;
                    minLength = right - left;
                }

                // Shrink the window from the left
                char leftChar = sChars[left++];
                if (charFrequency[leftChar]++ == 0) {
                    count++;
                }
            }
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);
    }

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }
}
