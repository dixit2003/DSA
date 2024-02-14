package Arrays;

public class MaxPopulationYear {
    static int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];

        for (int[] log : logs){
            int birthYear = log[0];
            int deathYear = log[1];
            arr[birthYear - 1950]++;
            arr[deathYear - 1950]--;
        }
        int max = arr[0];
        int year = 1950;
        for(int i = 1; i < 101; i++) {
            arr[i] += arr[i - 1];
            if (max < arr[i]) {
                max = arr[i];
                year = 1950 + i;
            }

        }
        return year;
    }

    public static void main(String[] args) {
        System.out.println(maximumPopulation(new int[][]{{1950,1961},{1960,1971},{1970,1981}}));
    }
}
