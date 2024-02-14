package BinarySearch;

public class Ceiling {
    static int ceilingOfANumber(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + ((end - start) / 2);
            if (arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return arr[start];
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        System.out.println(ceilingOfANumber(arr, 8));
    }

}
