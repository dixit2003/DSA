package RecursionAndDP.Leetcode;

public class PredictWinner {
    static boolean predictTheWinner(int[] nums) {
        return canWinHelper(nums, 0, nums.length - 1, 0, 0) >= 0;
    }
    private static int canWinHelper(int[] nums, int left, int right, int score1, int score2) {
        if (left > right) {
            return score1 - score2; // Base case
        }

        // Scenario 1: Player 1 picks the number at the left index
        int leftChoice = nums[left] - canWinHelper(nums, left + 1, right, score2, score1 + nums[left]);

        // Scenario 2: Player 1 picks the number at the right index
        int rightChoice = nums[right] - canWinHelper(nums, left, right - 1, score2, score1 + nums[right]);

        // The result is the maximum of both scenarios
        int result = Math.max(leftChoice, rightChoice);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(predictTheWinner(new int[]{1, 5, 233, 7}));
    }
}
