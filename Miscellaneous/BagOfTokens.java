package Miscellaneous;

import java.util.Arrays;

public class BagOfTokens {
    static int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int maxScore = 0;
        int score = 0;
        int l = tokens.length - 1;

        for (int i = 0; i <= l; i++) {
            if (power >= tokens[i]) {
                score++;
                maxScore = Math.max(score, maxScore);
                power -= tokens[i];
            }
            else if (score >= 1) {
                power += tokens[l];
                l--;
                i--;
                score--;
            }
        }
        return maxScore;
    }

    public static void main(String[] args) {
        System.out.println(bagOfTokensScore(new int[]{71, 55, 82}, 54));
    }
}
