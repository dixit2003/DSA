package Graphs;

import java.util.Arrays;

public class FloodFillAlgorithm {
    static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] vis = new boolean[image.length][image[0].length];
        dfs(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }

    private static void dfs(int[][] image, int sr, int sc, int color, boolean[][] vis, int earlier) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc]) {
            return;
        }
        image[sr][sc] = color;
        vis[sr][sc] = true;
        if (sr - 1 >= 0 && !vis[sr - 1][sc] && image[sr - 1][sc] == earlier) {
            dfs(image, sr - 1, sc, color, vis, earlier);
        }
        if (sc - 1 >= 0 && !vis[sr][sc - 1] && image[sr][sc - 1] == earlier) {
            dfs(image, sr, sc - 1, color, vis, earlier);
        }
        if (sr + 1 < image.length && !vis[sr + 1][sc] && image[sr + 1][sc] == earlier) {
            dfs(image, sr + 1, sc, color, vis, earlier);
        }
        if (sc + 1 < image[0].length && !vis[sr][sc + 1] && image[sr][sc + 1] == earlier) {
            dfs(image, sr, sc + 1, color, vis, earlier);
        }
    }

    public static void main(String[] args) {
        int[][] image = {{0,0,0},{0,0,0}};
        floodFill(image, 1, 0, 2);
        System.out.println(Arrays.deepToString(image));
    }

}
