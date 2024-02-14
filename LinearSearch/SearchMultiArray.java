package LinearSearch;

import java.util.Arrays;

public class SearchMultiArray {
    static int[] searchIn2DARray(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] == target)
                    return new int[]{i, j};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 7, 4}, {2, 3, 8, 13, 10}, {9, 17, 25, 27}};
        System.out.println(Arrays.toString(searchIn2DARray(arr, 13)));
    }
}
