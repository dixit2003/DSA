package Arrays;


import java.util.Arrays;

import java.util.Stack;

public class FloodFill {
    static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Stack<int[]> stack = new Stack<>();
        int srcColor = image[sr][sc];
        int m = image.length;
        int n = image[0].length;

        stack.push(new int[]{sr, sc});

        while (!stack.isEmpty()) {
            int[] arr = stack.pop();

            if (image[arr[0]][arr[1]] == srcColor) {
                image[arr[0]][arr[1]] = color;

                //Four directions
                if (arr[0] - 1 >= 0)
                    stack.push(new int[] {arr[0] - 1, arr[1]});
                if (arr[0] + 1 < m)
                    stack.push(new int[] {arr[0] + 1, arr[1]});
                if (arr[1] - 1 >= 0)
                    stack.push(new int[] {arr[0], arr[1] - 1});
                if (arr[1] + 1 < n)
                    stack.push(new int[] {arr[0], arr[1] + 1});
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        System.out.println(Arrays.deepToString(floodFill(image, 1, 1, 2)));

    }
}
