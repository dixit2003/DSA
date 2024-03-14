package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class IsGraphBipartite {

    // BFS Approach
    static boolean isBipartiteBFS(int[][] graph) {
        int[] color = new int[graph.length];
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            if (color[i] != 0) {
                continue;
            }
            color[i] = 1;
            q.offer(i);
            while (!q.isEmpty()) {
                int n = q.poll();

                for (int ele: graph[n]) {
                    if (color[ele] == 0) {
                        color[ele] = -color[n];
                        q.offer(ele);
                    }
                    else if (color[ele] !=  -color[n]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    // DFS Approach
    static boolean isBipartiteDFS(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];

        for (int i = 0; i < n; i++) {
            if (color[i] == 0 && !isBipartiteDFSHelper(graph, color, i, 1)) {
                return false;
            }
        }
        return true;
    }

    static boolean isBipartiteDFSHelper(int[][] graph, int[] color, int idx, int currColor) {
        if (color[idx] != 0) {
            return color[idx] == currColor;
        }

        color[idx] = currColor;
        for (int ele : graph[idx]) {
            if (!isBipartiteDFSHelper(graph, color, ele, -currColor)) {
                return false;
            }
        }
        return true;
    }




    public static void main(String[] args) {
        int[][] graph = {{1,2,3},{0,2},{1,3},{0,2}};
        System.out.println(isBipartiteBFS(graph));
        System.out.println(isBipartiteDFS(graph));

    }
}

