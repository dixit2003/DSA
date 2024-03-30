package RecursionAndDP;

import java.util.ArrayList;

public class CheckSorted {
    static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1)
            return true;

        return arr[i] < arr[i + 1] && isSorted(arr, i + 1);
    }
    //Using Arraylist as a paramenter
    static ArrayList multiOccurrences(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index == arr.length - 1)
            return list;

        if (arr[index] == target)
            list.add(index);

        return multiOccurrences(arr, target, index + 1, list);

    }
    //Using Arraylist inside the function's body
    static ArrayList multiOccurrences(int[] arr, int target, int index){
        ArrayList<Integer> list= new ArrayList<>();
        if (index == arr.length - 1)
            return list;

        //Contains only those index for a particular function call
        if (arr[index] == target)
            list.add(index);
        ArrayList<Integer> ansFromBelowCalls = multiOccurrences(arr, target,index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 2, 3, 8, 4, 5, 8, 6, 7, 8, 9, 8, 4, 8};
//        System.out.println(isSorted(arr, 0));
        System.out.println(multiOccurrences(arr, 8, 0));
    }
}
