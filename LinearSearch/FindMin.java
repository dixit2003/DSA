package LinearSearch;

public class FindMin {
    static int findTheMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28, 10, 31, 17, 20};
        System.out.println(findTheMin(arr));
    }
}
