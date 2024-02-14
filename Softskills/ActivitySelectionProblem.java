package Softskills;

public class ActivitySelectionProblem {
    static void printPossibleActivities(int[] start, int[] end) {
        int j = 0;
        System.out.print(0 +  " ");
        for (int i = 1; i < start.length; i++) {
            if (end[j] <= start[i]) {
                System.out.print(i + " ");
                j++;
            }
            else {
                j = i;
            }
        }
    }

    public static void main(String[] args) {
        printPossibleActivities(new int[]{1,3,5,7,8,11,15}, new int[]{3,4,7,10,12,13,15});
    }
}
