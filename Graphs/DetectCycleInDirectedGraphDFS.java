package Graphs;
import java.util.ArrayList;
import java.util.List;
public class DetectCycleInDirectedGraphDFS {
    static boolean isCyclic(int V, List<List<Integer>> adj) {
        boolean[] vis = new boolean[V];
        boolean[] path = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (dfs(adj, i, vis, path)) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean dfs(List<List<Integer>> adj, int src, boolean[] vis, boolean[] path) {
        vis[src] = true;
        path[src] = true;
        for (int ele: adj.get(src)) {
            if (!vis[ele]) {
                if (dfs(adj, ele, vis, path)) {
                    return true;
                }
            }
            else if (path[ele]) {
                return true;
            }
        }
        path[src] = false;
        return false;
    }

    public static void main(String[] args) {
        List<List<Integer>> al = new ArrayList<>();
        al.add(new ArrayList<>(List.of(1, 3)));
        al.add(new ArrayList<>(List.of(2)));
        al.add(new ArrayList<>(List.of(3)));
        al.add(new ArrayList<>(List.of(0)));

        System.out.println(isCyclic(4, al));


    }
}
