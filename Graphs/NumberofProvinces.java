package Graphs;

import java.util.ArrayList;
public class NumberofProvinces {
    static int findCircleNum(int[][] isConnected) {
        int count = 0;
        boolean[] vis = new boolean[isConnected[0].length + 1];
        for (int i = 0; i < isConnected.length; i++) {
            if (!vis[i]) {
                count++;
                dfs(isConnected, vis, i);
            }
        }
        return count;
    }
    static void dfs(int[][] isConnected, boolean[] vis, int i) {
        vis[i] = true;
        for (int j = 0; j < isConnected[i].length; j++) {
            if (!vis[j] && isConnected[i][j] == 1) {
                dfs(isConnected, vis, j);
            }
        }
    }

    public static void main(String[] args) {
        int[][] isConnected = {{1,0,0,1},
                               {0,1,1,0},
                               {0,1,1,1},
                               {1,0,1,1}};
        System.out.println(findCircleNum(isConnected));
    }

    // DFS function to traverse the graph
//    static void DFS(int node, ArrayList<ArrayList<Integer>> al, boolean[] visit) {
//        visit[node] = true;
//        for (Integer it : al.get(node)) {
//            if (!visit[it]) {
//                DFS(it, al, visit);
//            }
//        }
//    }
//
//    static int findCircleNum(int[][] isConnected) {
//        // Convert matrix to adjacency list
//        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
//        for (int i = 0; i < isConnected.length; i++) {
//            al.add(new ArrayList<Integer>());
//        }
//        for (int i = 0; i < isConnected.length; i++) {
//            for (int j = 0; j < isConnected[0].length; j++) {
//                if (isConnected[i][j] == 1 && i != j) {
//                    al.get(i).add(j);
//                    al.get(j).add(i);
//                }
//            }
//        }
//        System.out.println(al);
//
//        int count = 0;
//        boolean[] visit = new boolean[isConnected[0].length];
//
//        // DFS on each unvisited node
//        for (int i = 0; i < isConnected[0].length; i++) {
//            if (!visit[i]) {
//                DFS(i, al, visit);
//                count++;
//            }
//        }
//
//        // Return the total number of provinces
//        return count;
//    }
}
