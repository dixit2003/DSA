package Graphs;
import java.util.List;

import static Graphs.InputGraph.makeAdjacencyList;


public class DetectCycleinUndirectedGraphDFS {
    static boolean isCycle(int v, List<List<Integer>> al) {
        boolean[] vis = new boolean[al.size()];
        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                if (dfs(al, i, -1, vis))
                    return true;
            }
        }
        return false;
    }
    private static boolean dfs(List<List<Integer>> al, int src, int parent, boolean[] vis) {
        vis[src] = true;
        for (int ele : al.get(src)) {
            if (!vis[ele]) {
                if (dfs(al, ele, src, vis)) // Recursive call to the neighbor
                    return true;
            } else if (parent != ele) { // Check if the neighbor is not the parent
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[][] matrix = {{0, 0, 0, 0, 0}, {0, 0, 1, 3, 0}, {0, 1, 0, 0, 1}, {0, 1, 0, 0, 1}, {0, 0, 1, 1, 0}};

        List<List<Integer>> al = makeAdjacencyList(matrix);
        System.out.println(isCycle(al.size(), al));
    }


}
