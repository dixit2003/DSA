package BinarySearch;

public class AlgorithmExe {
    static int search1(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = ((end - start) / 2) + start; //Making sure the sum doesn't exceed INTEGER value
            if(arr[mid] < target){
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        System.out.println(search1(arr, 12));
    }
}
