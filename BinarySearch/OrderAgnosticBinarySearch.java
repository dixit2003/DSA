package BinarySearch;

public class OrderAgnosticBinarySearch {
    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = ((end - start) / 2) + start; //Making sure the sum doesn't exceed INTEGER value

            if (arr[mid] == target)
                return mid;

            if (isAsc){
                if(arr[mid] < target){
                    start = mid + 1;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                }
            }
            else {
                if(arr[mid] > target){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {48, 36, 30, 20, 15, 10, 7, 5, 4, 2, 1};
        System.out.println(search(arr, 15));
    }
}
