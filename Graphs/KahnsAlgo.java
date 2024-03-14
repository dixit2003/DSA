package Graphs;

import java.util.*;

public class KahnsAlgo {
    static int[] kahn(List<List<Integer>> graph) {
        int[] ans = new int[graph.size()];
        int idx = 0;
        int[] inDegree = new int[graph.size()];
        for (List<Integer> list : graph) {
            for (int ele : list) {
                inDegree[ele]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 0) {
                ans[idx++] = i;
                q.offer(i);
            }
        }
        while (!q.isEmpty()) {
            int ele = q.poll();
            for (int i = 0; i < graph.get(ele).size(); i++) {
                int id = graph.get(ele).get(i);
                inDegree[id]--;
                if (inDegree[id] == 0) {
                    ans[idx++] = id;
                    q.offer(id);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        List<List<Integer>> graph = new ArrayList<>();
        graph.add(List.of());
        graph.add(List.of());
        graph.add(List.of(3));
        graph.add(List.of(1));
        graph.add(List.of(0, 1));
        graph.add(List.of(0, 2));

        System.out.println(Arrays.toString(kahn(graph)));
    }
}
