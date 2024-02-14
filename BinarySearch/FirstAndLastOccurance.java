package BinarySearch;

import java.util.Arrays;



public class FirstAndLastOccurance {
    static int[] searchOccurance(int[] arr, int target){
        int[] res = {-1, -1};
        int start = searchForIndex(arr, target, true);
        int end = searchForIndex(arr, target, false);

        res[0] = start;
        res[1] = end;

        return res;
    }
    static int searchForIndex(int[] arr, int target, boolean findFIrstIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = ((end - start) / 2) + start;
            if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }else {
                ans = mid;
                if(findFIrstIndex){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 9, 9, 9, 9, 9, 9, 10, 11, 12, 14, 20, 36, 48};
        //System.out.println(Arrays.toString(searchOccurance(arr, 9)));

    }
}

