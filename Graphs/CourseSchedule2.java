package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CourseSchedule2 {
    static int[] findOrder(int numCourses, int[][] matrix) {
        boolean[] vis = new boolean[numCourses];
        boolean[] path = new boolean[numCourses];
        List<List<Integer>> al = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            al.add(new ArrayList<>());
        }
        for (int[] arr : matrix) {
            al.get(arr[1]).add(arr[0]);
        }
        System.out.println(al);
        for (int i = 0; i < numCourses; i++) {
            if (!vis[i]) {
                if (dfs(al, i, vis, path, stack)) {
                    return new int[]{};
                }
            }
        }
        int i = 0;
        while (!stack.isEmpty()) {
            ans[i++] = stack.pop();
        }
        return ans;
    }
    static boolean dfs(List<List<Integer>> al, int src, boolean[] vis, boolean[] path, Stack<Integer> stack) {
        vis[src] = true;
        path[src] = true;
        for (int ele: al.get(src)) {
            if (!vis[ele]) {
                if (dfs(al, ele, vis, path, stack)) {
                    return true;
                }
            }
            else if (path[ele]) {
                return true;
            }
        }
        path[src] = false;
        stack.push(src);
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{0, 1}, {1, 0}};
        System.out.println(Arrays.toString(findOrder(2, matrix)));
    }
}
