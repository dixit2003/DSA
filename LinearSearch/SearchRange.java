package LinearSearch;

public class SearchRange {
    static boolean searchTheRange(int[] arr, int[] range, int target){
        for (int i = range[0]; i <= range[1]; i++){
            if (arr[i] == target) return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28, 10, 31, 17, 20};
        int[] range = {2, 8};
        int target = 20;
        System.out.println(searchTheRange(arr, range, target));
    }
}
