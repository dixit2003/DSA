package StringBuilders;

import java.util.HashMap;
import java.util.TreeSet;

public class SortVowels {
    static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

    static String sortVowels(String str) {
        int[] count = new int[256];

        // Store the frequencies for each character.
        for (char c : str.toCharArray()) {
            if (isVowel(c)) {
                count[c]++;
            }
        }

        // Sorted string having all the vowels.
        String sortedVowel = "AEIOUaeiou";
        StringBuilder ans = new StringBuilder();
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!isVowel(str.charAt(i))) {
                ans.append(str.charAt(i));
            } else {
                // Skip to the character which is having remaining count.
                while (count[sortedVowel.charAt(j)] == 0) {
                    j++;
                }

                ans.append(sortedVowel.charAt(j));
                count[sortedVowel.charAt(j)]--;
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String input = "lEetcOde";
        String sortedVowels = sortVowels(input);
        System.out.println(sortedVowels);
    }

}
