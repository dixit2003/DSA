package StringBuilders;

public class MinStepsToMakeTwoStringsAnagram {
    static int minSteps(String s, String t) {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        int steps = 0;
        for (int ele: freq) {
            if (ele >= 1) {
                steps += ele;
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        System.out.println(minSteps("leetcode", "practice"));
    }
}
