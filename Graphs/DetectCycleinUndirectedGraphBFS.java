package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static Graphs.InputGraph.makeAdjacencyList;

public class DetectCycleinUndirectedGraphBFS {
    static boolean isCycle(int V, List<List<Integer>> al) {
        boolean[] vis = new boolean[al.size() + 1];
        for (int i = 0; i < V; i++) {
        if (!vis[i]) {
                if (detectCycle(al, i, vis))
                    return true;
            }
        }
        return false;
    }
    private static boolean detectCycle(List<List<Integer>> al, int src, boolean[] vis) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{src, -1});
        vis[src] = true;
        while(!q.isEmpty()) {
            int[] popped = q.poll();
            int node = popped[0];
            int par = popped[1];

            for(int it: al.get(node)) {
                if(!vis[it]) {
                    q.add(new int[]{it, node});
                    vis[it] = true;
                }
                else if(par != it) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{0, 0, 0, 0, 0}, {0, 0, 1, 3, 0}, {0, 1, 0, 0, 1}, {0, 1, 0, 0, 0}, {0, 0, 1, 0, 0}};

        List<List<Integer>> al = makeAdjacencyList(matrix);
        System.out.println(isCycle(al.size(), al));
    }
}
