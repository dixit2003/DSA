package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphInput {
    public static void main(String[] args) {
        // Create adjacency list
        List<List<Integer>> graph = new ArrayList<>();

        // Initialize adjacency list for each vertex
        for (int i = 0; i < 10; i++) {
            graph.add(new ArrayList<>());
        }

        // Example: Adding edges to the graph
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 6);
        addEdge(graph, 2, 3);
        addEdge(graph, 2, 4);

        addEdge(graph, 6, 7);
        addEdge(graph, 6, 9);
        addEdge(graph, 4, 5);

        addEdge(graph, 5, 8);

        // Print the adjacency list
//        printGraph(graph);

        System.out.println("The BFS: " + bfs(graph));

        System.out.println("The DFS: " + dfs(graph, new boolean[10], 1));
    }

    // Function to add an edge to the graph
    private static void addEdge(List<List<Integer>> graph, int src, int dest) {
        // Since it's an undirected graph, we add both src to dest and dest to src
        graph.get(src).add(dest);
        graph.get(dest).add(src);
    }

    // Function to print the adjacency list
    private static void printGraph(List<List<Integer>> graph) {
        for (int i = 0; i < graph.size(); i++) {
            System.out.print("Vertex " + i + " is connected to:");
            for (int j : graph.get(i)) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }

    // BFS on Graphs
    private static List<Integer> bfs(List<List<Integer>> graph) {
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[graph.size()];
        q.add(1);
        vis[1] = true;

        while (!q.isEmpty()) {
            int ele = q.poll();
            ans.add(ele);

            for (int i: graph.get(ele)) {
                if (!vis[i]) {
                    q.offer(i);
                    vis[i] = true;
                }
            }
        }
        return ans;
    }

    //DFS on Graphs
    private static List<Integer> dfs(List<List<Integer>> graphs, boolean[] vis, int node) {

        List<Integer> ans = new ArrayList<>();
        ans.add(node);
        vis[node] = true;
        for (int i = 0; i < graphs.get(node).size(); i++) {
            if (!vis[graphs.get(node).get(i)]) {
                ans.addAll(dfs(graphs, vis, graphs.get(node).get(i)));
            }
        }
        return ans;
    }
}
