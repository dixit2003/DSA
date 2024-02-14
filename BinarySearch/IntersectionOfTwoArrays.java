package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays {
    static int[] intersection(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (arr1[0] == arr2[arr2.length - 1]) {
            return new int[]{arr1[0]};
        }
        if (arr1[arr1.length - 1] == arr2[0]) {
            return new int[]{arr2[0]};
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr2.length; i++) {
            if (i >= 1 && arr2[i] == arr2[i - 1]) {
                continue;
            }
            boolean presence = binarySearch(arr1, arr2[i]);
            if (presence) {
                list.add(arr2[i]);
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
    static boolean binarySearch(int[] arr, int target) {

        int i = 0;
        int j = arr.length-1;
        while(i <= j){
            int mid = i + ((j - i) / 2);
            if(arr[mid] == target)
                return true;
            else if(arr[mid] < target)
                i = mid + 1;
            else
                j = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})));
    }
}
