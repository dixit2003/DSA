package RecursionAndDP.Backtracking;

import java.util.ArrayList;

public class RatInAMaze {
    static ArrayList<String> findPath(int[][] m) {
        ArrayList<String> list = new ArrayList<>();
        helper2(m, 0, 0, "", list);
        return list;
    }
    static void helper(int[][] m, int i, int j, String ans, ArrayList<String> list) {
        if (i < 0 || j < 0 || i >= m.length || j >= m[0].length || m[i][j] == 0) {
            return;
        }
        if (i == m.length - 1 && j == m[0].length -1) {
            list.add(ans);
            return;
        }
        m[i][j] = 0;

        // Up
        helper(m, i - 1, j, ans + 'U', list);
        // Down
        helper(m, i + 1, j, ans + 'D', list);
        // Left
        helper(m, i, j - 1, ans + 'L', list);
        // Right
        helper(m, i, j + 1, ans + 'R', list);

        m[i][j] = 1;
    }
    static void helper2(int[][] m, int i, int j, String ans, ArrayList<String> list) {
        if (i == m.length - 1 && j == m[0].length - 1) {
            list.add(ans);
            return;
        }
        if (m[i][j] == 0) {
            return;
        }
        m[i][j] = 0;
        // Up
        if (i > 0) {
            helper2(m, i - 1, j, ans + 'U', list);
        }
        // Down
        if (i < m.length - 1) {
            helper2(m, i + 1, j, ans + 'D', list);
        }
        // Left
        if (j > 0) {
            helper2(m, i, j - 1, ans + 'L', list);
        }
        // Right
        if (j  < m.length - 1) {
            helper2(m, i, j + 1, ans + 'R', list);
        }
        m[i][j] = 1;
    }

    public static void main(String[] args) {
        System.out.println(findPath(new int[][]{{1, 1, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}}));
        System.out.println(findPath(new int[][]{{1, 0, 1, 0}}));

        System.out.println(findPath(new int[][]{{1, 1, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}}));
        System.out.println(findPath(new int[][]{{1, 0, 1, 0}}));
    }
}
