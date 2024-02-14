package BinarySearch;

public class ElementInInfiniteArray {
    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while (target > arr[end]){
            int newStart = end + 1;
            end = end + ((end - start + 1) * 2);
            start = newStart;
        }
        return infiniteArray(arr, target, start, end);
    }
    static int infiniteArray(int[] arr, int target, int start, int end){
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
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48, 50, 55, 57, 61, 62, 67};
        System.out.println(ans(arr, 36));
    }
}
