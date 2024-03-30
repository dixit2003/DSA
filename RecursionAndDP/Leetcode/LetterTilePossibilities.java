package RecursionAndDP.Leetcode;

public class LetterTilePossibilities {
    static int numTilePossibilities(String tiles) {
        int[] arr = new int[26];
        for (int i = 0; i < tiles.length(); i++) {
            arr[tiles.charAt(i) - 'A']++;
        }
        return helper(tiles, arr);
    }
    static int helper(String tiles, int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arr[i]--;
                count += 1 + helper(tiles, arr);
                arr[i]++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numTilePossibilities("AAB"));
    }
}
