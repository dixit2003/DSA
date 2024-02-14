package StacksAndQueues.Stacks;

public class GasStation {
    static int canCompleteCircuit(int[] gas, int[] cost) {
        int req = 0;
        for (int i = 0; i < gas.length; i++) {
            req += gas[i] - cost[i];
        }
        if (req < 0) {
            return -1;
        }

        int total = 0;
        int index = 0;
        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];

            if (total < 0) {
                index = i + 1;
                total = 0;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
    }
}
