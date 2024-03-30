package Recursions.Backtracking;

import java.util.Arrays;

public class IncludeAllPaths {
    //This is concept of Backtracking
    static void allPaths(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.print(p + " ");
            return;
        }

        if (!maze[r][c])
            //If obstacle found (false), stop the recursion for that call and return to previous function call
            return;

        //Before moving to next call, make the current block false
        maze[r][c] = false;

        if (c > 0)
            allPaths(p + 'L', maze, r, c - 1);
        if (c < maze[0].length - 1)
            allPaths(p + 'R', maze, r, c + 1);
        if (r > 0)
            allPaths(p + 'U', maze, r - 1, c);
        if (r < maze[0].length - 1)
            allPaths(p + 'D', maze, r + 1, c);

        //Before returning to the next function call, restore the changes made before the function gets removed from the stack
        maze[r][c] = true;
    }
    static void allPathsPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            System.out.println(p);
            for (int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            return;
        }


        if (!maze[r][c])
            //If obstacle found (false), stop the recursion for that call and return to previous function call
            return;

        //Before moving to next call, make the current block false
        maze[r][c] = false;
        path[r][c] = step;

        if (c > 0)
            allPathsPrint(p + 'L', maze, r, c - 1, path, step + 1);
        if (c < maze[0].length - 1)
            allPathsPrint(p + 'R', maze, r, c + 1, path, step + 1);
        if (r > 0)
            allPathsPrint(p + 'U', maze, r - 1, c, path, step + 1);
        if (r < maze[0].length - 1)
            allPathsPrint(p + 'D', maze, r + 1, c, path, step + 1);

        //Before returning to the next function call, restore the changes made before the function gets removed from the stack
        maze[r][c] = true;
        path[r][c] = 0;
    }

    public static void main(String[] args) {
        boolean[][] arr = {{true, true, true},
                           {true, true, true},
                           {true, true, true}};

        allPaths("", arr, 0, 0);
//        int[][] path = new int[arr.length][arr[0].length];
//        allPaths("", arr, 0, 0);
//        allPathsPrint("", arr, 0, 0, path, 1);
    }
}
