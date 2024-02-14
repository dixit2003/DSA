package LinearSearch;

public class SearchArray {
    static int searchTheArray(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 7, 10, 13, 11, 18, 9, 20};
        System.out.println(searchTheArray(arr, 2));
    }
}
