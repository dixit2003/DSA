package Arrays;

import java.util.Arrays;

public class FlowersInBloom {
    static int[] fullBloomFlowers(int[][] flowers, int[] persons) {
            int n = flowers.length;
            int[] start = new int[n];
            int[] end = new int[n];

            for (int i = 0; i < n; i++) {
                start[i] = flowers[i][0];
                end[i] = flowers[i][1];
            }

            Arrays.sort(start);
            Arrays.sort(end);

            int[] res = new int[persons.length];

            for (int i = 0; i < persons.length; i++) {
                int t = persons[i];
                int started = binarySearchUpperBound(start, t);
                int ended = binarySearchLowerBound(end, t);
                res[i] = started - ended;
            }
            return res;
        }

        static int binarySearchUpperBound(int[] arr, int target) {
            int left = 0;
            int right = arr.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] <= target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return left;
        }
        static int binarySearchLowerBound(int[] arr, int target) {
            int left = 0;
            int right = arr.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return left;
        }

    public static void main(String[] args) {
        int[][] flowers1 = {{1, 6}, {3, 7}, {9, 12}, {4, 13}};
        int[] people1 = {2, 3, 7, 11};

        int[][] flowers2 = {{1, 10}, {3, 3}};
        int[] people2 = {3, 3, 2};
        System.out.println(Arrays.toString(fullBloomFlowers(flowers1, people1)));
        System.out.println(Arrays.toString(fullBloomFlowers(flowers2, people2)));
    }
}
