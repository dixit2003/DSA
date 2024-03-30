package Softskills;

public class StringContinuousComboSum {
    static int sum(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                sum += Integer.parseInt(str.substring(i, j));
            }
        }

        return sum;

    }

    public static void main(String[] args) {
        System.out.println(sum("321"));
    }
}
