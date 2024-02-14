package Arrays;

public class OddElements {
    static int oddCells(int m, int n, int[][] indices) {
        int res = 0;

        int[] rowMat = new int[m];
        int[] colMat = new int[n];

        for (int[] dim: indices) {
            int row = dim[0];
            int col = dim[1];
            rowMat[row]++;
            colMat[col]++;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((rowMat[i] + colMat[j]) % 2 == 1) {
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(oddCells(2, 3, new int[][]{{0,1},{1,1}}));
    }
}
