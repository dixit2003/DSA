package RecursionAndDP.Leetcode;


public class TriangularSumOfAnArray {
    static int triangularSum(int[] arr) {
        return helper(arr, arr.length);
    }
    private static int helper(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        for (int i = 0; i < n - 1; i++) {
            if (i + 1 < arr.length){
                arr[i] = (arr[i] + arr[i + 1]) % 10;
            }
        }
        return helper(arr, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(triangularSum(new int[]{1,2,3,4,5}));
    }
}
