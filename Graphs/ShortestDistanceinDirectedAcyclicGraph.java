package Graphs;

import java.util.*;

public class ShortestDistanceinDirectedAcyclicGraph {
    static int[] shortestPath(int N,int M, int[][] edges) {
        List<List<Pair>> graph = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int idx = edge[0];
            int neig = edge[1];
            int wgt = edge[2];

            graph.get(idx).add(new Pair(neig, wgt));
        }
        Stack<Integer> stack = new Stack<>();
        boolean[] vis = new boolean[N];
        for (int i = 0; i < N; i++) {
            if (!vis[i]) {
                dfs(graph, stack, vis, i);
            }
        }
        int[] distances = new int[N];
        Arrays.fill(distances, (int)(1e9));
        distances[0] = 0;

        while (!stack.isEmpty()) {
            int node = stack.pop();
            for (int i = 0; i < graph.get(node).size(); i++) {
                int neig = graph.get(node).get(i).neig;
                int wgt = graph.get(node).get(i).wgt;
                if (distances[node] + wgt < distances[neig]) {
                    distances[neig] = wgt + distances[node];
                }
            }
        }
        for (int i = 0; i < N; i++) {
            if (distances[i] == (int)(1e9)) distances[i] = -1;
        }
        return distances;
    }
    static void dfs(List<List<Pair>> graph, Stack<Integer> stack, boolean[] vis, int src) {
        vis[src] = true;
        for (Pair pair: graph.get(src)) {
            if (!vis[pair.neig]) {
                dfs(graph, stack, vis, pair.neig);
            }
        }
        stack.push(src);
    }

    public static void main(String[] args) {
        int[][] edges = {{0,1,2},{0,4,1},{4,5,4},{4,2,2},{1,2,3},{2,3,6},{5,3,1}};
        System.out.println(Arrays.toString(shortestPath(6, 7, edges)));
    }

}
class Pair {
    int neig;
    int wgt;

    Pair(int _neig, int _wgt) {
        this.neig = _neig;
        this.wgt = _wgt;
    }
}
