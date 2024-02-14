package StriversSheet.Arrays;

import java.util.Arrays;

public class SetMarixZeroes {
    static void setZeroes(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        int col0 = 1;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if(j != 0){
                        matrix[0][j] = 0;
                    }else{
                        col0 = 0;
                    }
                }
            }
        }

        for(int i = 1; i < row; i++){
            for(int j = 1; j < col; j++){

                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(matrix[0][0] == 0){
            for(int j = 0; j < col; j++){
                matrix[0][j] = 0;
            }
        }

        if(col0 == 0){
            for(int i = 0; i < row; i++){
                matrix[i][0] = 0;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1,1}, {1,0,1,1}, {1,1,0,1}, {0,1,1,1}};
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
