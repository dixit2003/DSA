package Graphs;

import java.util.ArrayList;
import java.util.List;

public class InputGraph {
    public static List<List<Integer>> makeAdjacencyList(int[][] matrix) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i <= matrix.length; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0) {
                    list.get(i).add(j);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
