package Arrays;

public class WinnerElement {
    static int getWinner(int[] arr, int k) {
        int track = 0;
        k = arr.length < k ? arr.length % k : k;

        int winner = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > winner) {
                winner = arr[i];
                track = 1;
            } else {
                track++;
            }
            if (track == k) {
                return winner;
            }
        }
        return winner;
    }

    public static void main(String[] args) {
        System.out.println(getWinner(new int[]{3, 1, 2}, 10));
    }
}
