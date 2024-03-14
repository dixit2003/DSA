package Graphs;
import java.util.*;

import static Graphs.InputGraph.makeAdjacencyList;
public class FindEventualSafeStates {
    static List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> al = new ArrayList<>();
        for (int i = 0; i < graph.length; i++) {
            al.add(new ArrayList<>());
        }
        int[] inDegree = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            for (int ele: graph[i]) {
                al.get(ele).add(i);
                inDegree[i]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 0) {
                q.offer(i);
            }
        }
        while (!q.isEmpty()) {
            int ele = q.poll();
            ans.add(ele);
            for (int x: al.get(ele)) {
                inDegree[x]--;
                if (inDegree[x] == 0)
                    q.offer(x);
            }
        }
        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[][] graph = {{},{0,2,3,4},{3},{4},{}};
        System.out.println(eventualSafeNodes(graph));
    }
}
