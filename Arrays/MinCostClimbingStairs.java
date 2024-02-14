package Arrays;

public class MinCostClimbingStairs {
    static int minCostClimbingStairs(int[] arr) {
        int cost0 = arr[0];
        int cost1 = arr[1];

        for (int i = 2; i < arr.length; i++) {
            int currentCost = arr[i] + Math.min(cost0, cost1);
            cost0 = cost1;
            cost1 = currentCost;
        }

        return Math.min(cost0, cost1);

    }

    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[] {1,100,1,1,1,100,1,1,100,1}));
    }
}

