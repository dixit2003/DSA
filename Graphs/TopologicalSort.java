package Graphs;

import java.util.Stack;

public class TopologicalSort {
    static void topoSort(int[][] graph) {
        boolean[] vis = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                dfs(graph, vis, i, stack);
            }
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
    static void dfs(int[][] graph, boolean[] vis, int src, Stack<Integer> stack) {
        vis[src] = true;
        for (int ele: graph[src]) {
            if (!vis[ele]) {
                dfs(graph, vis, ele, stack);
            }
        }
        stack.push(src);
    }

    public static void main(String[] args) {
        int[][] graph = {{2, 3}, {4}, {1, 3}, {1}, {}, {1, 4}};
        topoSort(graph);
    }
}
