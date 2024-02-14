package BinarySearch;

public class BinarySearch2DII {
    static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length; //total number of rows
        int cols = matrix[0].length; //total number of columns
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = (cols - 1) / 2;

        //if matrix is null, given minimum rows is 1, but columns can be 0
        //if columns = 0, then matrix is null

        if(cols == 0) {
            return false;
        }

        //if 1D array

        if(rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        //run loop until only two rows are left

        while(rStart < (rEnd - 1)) {

            int rMid = rStart + (rEnd - rStart) / 2;

            if(matrix[rMid][cMid] == target) {
                return true;
            }

            if(matrix[rMid][cMid] > target) {
                rEnd = rMid;
            }

            else {
                rStart = rMid;
            }
        }

        if(matrix[rStart][cMid] == target) {
            return true;
        }

        if(matrix[rEnd][cMid] == target) {
            return true;
        }

        if(matrix[rStart][cMid] > target) {
            if (binarySearch(matrix, rStart, 0, cMid - 1, target)) {
                return true;
            }
        }

        if(matrix[rStart][cMid] < target && target <= matrix[rStart][cols - 1]) {
            if (binarySearch(matrix, rStart, cMid + 1, cols - 1, target)) {
                return true;
            }
        }

        if(matrix[rEnd][cMid] > target) {
            if (binarySearch(matrix, rEnd, 0, cMid - 1, target)) {
                return true;
            }
        }

        if (matrix[rEnd][cMid] < target){
            if (binarySearch(matrix, rEnd, cMid + 1, cols - 1, target)) {
                return true;
            }
        }
        return false;

    }

//you want binary search in 1D array, of which matrix, in which row
//what are the start and end indices and what is the target

    static boolean binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {

        while(cStart <= cEnd) {

            int mid = cStart + (cEnd - cStart) / 2;

            if(matrix[row][mid] == target) {
                return true;
            }
            else if(matrix[row][mid] > target) {
                cEnd = mid - 1;
            }
            else cStart = mid + 1;
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {{5,6,10,14}, {6,10,13,18}, {10,13,18,19}};
        System.out.println(searchMatrix(arr, 14));
    }
}
