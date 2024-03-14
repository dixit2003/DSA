package Graphs;

import javax.swing.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Matrix01 {
    static int[][] updateMatrix(int[][] mat) {
        int[][] ans = new int[mat.length][mat[0].length];
        int[][] vis = new int[mat.length][mat[0].length];

        Queue<Node> q = new LinkedList<>();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    q.offer(new Node(new int[]{i, j}, 0));
                    ans[i][j] = 0;
                }
            }
        }
        while (!q.isEmpty()) {
            Node n = q.poll();
            int i = n.dim[0];
            int j = n.dim[1];

            int dist = n.dist;

            if (i - 1 >= 0 && mat[i - 1][j] == 1 && vis[i - 1][j] != 1) {
                vis[i - 1][j] = 1;
                ans[i - 1][j] = dist + 1;
                q.offer(new Node(new int[]{i - 1, j}, dist + 1));
            }
            if (i + 1 < mat.length && mat[i + 1][j] == 1 && vis[i + 1][j] != 1) {
                vis[i + 1][j] = 1;
                ans[i + 1][j] = dist + 1;
                q.offer(new Node(new int[]{i + 1, j}, dist + 1));
            }
            if (j - 1 >= 0 && mat[i][j - 1] == 1 && vis[i][j - 1] != 1) {
                vis[i][j - 1] = 1;
                ans[i][j - 1] = dist + 1;
                q.offer(new Node(new int[]{i, j - 1}, dist + 1));
            }
            if (j + 1 < mat[0].length && mat[i][j + 1] == 1 && vis[i][j + 1] != 1) {
                vis[i][j + 1] = 1;
                ans[i][j + 1] = dist + 1;
                q.offer(new Node(new int[]{i, j + 1}, dist + 1));
            }

        }
        return ans;

    }

    public static void main(String[] args) {
        int[][] mat = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        System.out.println(Arrays.deepToString(updateMatrix(mat)));
    }

}

