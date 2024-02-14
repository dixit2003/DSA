package Arrays;

public class EliminateMonsters {
    static int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length; // Number of monsters

        // Calculate the time it takes for each monster to reach the city and store it in the "arrivalTimes" array.
        int[] arrivalTimes = new int[n];
        for (int i = 0; i < n; i++) {
            arrivalTimes[i] = (int) Math.ceil((double) dist[i] / speed[i]);
            speed[i] = 0; // Initialize the "speed" array to 0 for counting monsters arriving at the same time.
        }

        // Count the number of monsters arriving at each minute.
        for (int arrivalTime : arrivalTimes) {
            if (!(arrivalTime >= n))
                speed[arrivalTime]++;
        }

        // Calculate the cumulative count of monsters arriving at or before each minute.
        for (int i = 1; i < n; i++) {
            speed[i] += speed[i - 1];

            // If the cumulative count exceeds the current minute, return the maximum number of eliminated monsters.
            if (speed[i] > i) {
                return i;
            }
        }

        // If no game loss occurs, return the total number of monsters, as all of them can be eliminated.
        return n;
    }

    public static void main(String[] args) {
        System.out.println(eliminateMaximum(new int[]{46,33,44,42,46,36,7,36,31,47,38,42,43,48,48,25,28,44,49,47,29,32,30,6,42,9,39,48,22,26,50,34,40,22,10,45,7,43,24,18,40,44,17,39,36}, new int[]{1,2,1,3,1,1,1,1,1,1,1,1,1,1,7,1,1,3,2,2,2,1,2,1,1,1,1,1,1,1,1,6,1,1,1,8,1,1,1,3,6,1,3,1,1}));
    }
}
