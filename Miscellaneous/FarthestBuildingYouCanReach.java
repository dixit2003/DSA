package Miscellaneous;

import java.util.PriorityQueue;

public class FarthestBuildingYouCanReach {

    static int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int i = 0;

        for (; i < heights.length - 1; i++) {
            if (heights[i + 1] < heights[i]) {
                continue;
            }
            int diff = heights[i + 1] - heights[i];

            if (bricks >= diff) {
                bricks -= diff;
                pq.offer(diff);
            }
            else  if (ladders > 0){
                if (!pq.isEmpty()) {
                    int max_past = pq.peek();
                    if (diff < max_past) {
                        bricks += max_past;
                        pq.poll();
                        bricks -= diff;
                        pq.offer(diff);
                    }
                }
                ladders--;
            }
            else {
                break;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(furthestBuilding(new int[]{4,12,2,7,3,18,20,3,19}, 10, 2));
    }
}
