package BinarySearch;

public class splitArrayLargestSum {
    static int findArrayLargestSum(int[] arr, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++){
            start = Math.max(start, arr[i]);
            end += arr[i];
        }
        //Apply Search
        while (start <= end) {
            int mid = start + ((end - start) / 2);

            //To how many pieces we can divide the array considering the max sum
            int sum = 0;
            int pieces = 1;
            for(int num: arr){
                if (sum + num > mid){
                    //you cannot add the element. Make new one
                    //Say you ass this num in new sub-array, then sum = num
                    sum = num;
                    pieces++;
                }else {
                    sum += num;
                }

            }
            if (pieces > m){
                start = mid + 1;
            }else {
                end = mid;
            }


        }
        return end;
    }



}
