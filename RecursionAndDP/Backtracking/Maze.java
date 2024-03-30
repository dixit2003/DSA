package Recursions.Backtracking;

import java.util.ArrayList;

public class Maze {
    static int countOfPaths(int r, int c, int n) {
        if (r == n - 1 || c == n - 1)
            return 1;

        int down = countOfPaths(r + 1, c, n);
        int right = countOfPaths(r, c + 1, n);

        return down + right;
    }
    static ArrayList<String> printPaths(String p, int r, int c) {
        if (r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> paths = new ArrayList<>();

        if (r > 1)
            paths.addAll(printPaths(p + 'D', r - 1, c));

        if (c > 1)
            paths.addAll(printPaths(p + 'R', r, c - 1));

        return paths;
    }
    static ArrayList<String> printPathsWithDiagnol(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> paths = new ArrayList<>();

        if (r > 1)
            paths.addAll(printPathsWithDiagnol(p + 'V', r - 1, c));
        if (c > 1)
            paths.addAll(printPathsWithDiagnol(p + 'H', r, c - 1));
        if (r > 1 && c > 1)
            paths.addAll(printPathsWithDiagnol(p + 'D', r - 1, c - 1));

        return paths;
    }
    static void pathsWithRestrictions(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.print(p + " ");
            return;
        }

        if (!maze[r][c])
            //If obstacle found, stop the recursion for that call and return to previous function call
            return;

        if (r < maze.length - 1)
            pathsWithRestrictions(p + 'D', maze, r + 1, c);
        if (c < maze[0].length - 1)
            pathsWithRestrictions(p + 'R', maze, r, c + 1);

    }



    public static void main(String[] args) {
        System.out.println(countOfPaths(0, 0, 5));
//        System.out.println(printPathsWithDiagnol("", 3, 3));
//        boolean[][] arr = {{true, true, true},
//                            {true, false, true},
//                            {true, true, true}};
//
//        pathsWithRestrictions("", arr, 0, 0);

    }
}
