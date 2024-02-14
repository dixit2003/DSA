import java.util.ArrayList;
import java.util.List;
public class RecursionSolutions {
    public static ArrayList<String> findPath(int[][] m, int n) {
        boolean[][] arr = {{true, true, true},
                {true, true, true},
                {true, true, true}};
        ArrayList<String> list = new ArrayList<>();
        findPath(m, arr, 0, 0, list, "");
        return list;
    }
    static void findPath(int[][] m, boolean[][] arr, int i, int j, ArrayList<String> list, String ans) {
        if (i == m.length - 1 && j == m[0].length - 1) {
            list.add(ans);
            return;
        }

        if (!arr[i][j]) {
            return;
        }

        arr[i][j] = false;

        if (j > 0) {
            findPath(m, arr, i, j - 1, list, ans + "L");
        }
        if (j < m[0].length - 1) {
            findPath(m, arr, i, j + 1, list, ans + "R");
        }
        if (i > 0) {
            findPath(m, arr, i - 1, j, list, ans + "U");
        }
        if (i < m.length - 1) {
            findPath(m, arr, i + 1, j, list, ans + "D");
        }
        arr[i][j] = true;
    }
    public static boolean exist(char[][] board, String word) {
        boolean[][] checkerBoard = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (helperExists(board, checkerBoard, 0, 0, 0, word)) {
                    return true;
                }
            }
        }
        return false;
    }
    static boolean helperExists(char[][] board, boolean[][] visited, int i, int j, int idx, String word) {
        if (idx == word.length()) {
            return true;
        }
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length) {
            return false;
        }
        if (visited[i][j] || board[i][j] != word.charAt(idx)) {
            return false;
        }

        visited[i][j] = true;
        // Up
        if (helperExists(board, visited, i - 1, j, idx + 1, word)) {
            return true;
        }
        // Down
        if (helperExists(board, visited, i + 1, j, idx + 1, word)) {
            return true;
        }
        // Left
        if (helperExists(board, visited, i, j - 1, idx + 1, word)) {
            return true;
        }
        // Right
        if (helperExists(board, visited, i, j + 1, idx + 1, word)) {
            return true;
        }
        visited[i][j] = false;

        return false;
    }
    static List<String> letterCombinations(String up) {
        if (up.isEmpty()) {
            return new ArrayList<>();
        }
        return helperLetterCombinations("", up);
    }
    static List<String> helperLetterCombinations(String p, String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        int start = (digit - 2) * 3;

        if (digit > 7) {
            start += 1;
        }
        int end = start + 3;
        if (digit == 7 || digit == 9)
            end += 1;

        for (int i = start; i < end; i++) {
            ans.addAll(helperLetterCombinations(p + (char) ('a' + i), up.substring(1)));
        }
        return ans;
    }
    static List<List<Integer>> subsets(int[] arr) {
        return subsetsHelper(arr, new ArrayList<>(), 0);
    }
    static List<List<Integer>> subsetsHelper(int[] arr, List<Integer> set, int j) {
        if (j == arr.length) {
            List<List<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>(set));
            return list;
        }
        List<List<Integer>> ans = new ArrayList<>();
        set.add(arr[j]);
        ans.addAll(subsetsHelper(arr, set, j + 1));
        set.remove(set.size() - 1);
        ans.addAll(subsetsHelper(arr, set, j + 1));

        return ans;
    }
    static List<List<Integer>> permutations(int[] arr) {
        List<Integer> set = new ArrayList<>();
        for (int j : arr) {
            set.add(j);
        }
        return permutationsHelper(set, 0);
    }
    static List<List<Integer>> permutationsHelper(List<Integer> set, int j) {
        if (j == set.size()) {
            List<List<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>(set));
            return list;
        }
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = j; i < set.size(); i++) {
            swap(set, i, j);
            ans.addAll(permutationsHelper(set, j + 1));
            swap(set, i, j);
        }
        return ans;
    }
    static void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public static void main(String[] args) {
//        System.out.println(exist(new char[][]{{'A', 'B', 'C', 'E'},{'S', 'F', 'C', 'S'},{'A', 'A', 'E', 'E'}}, "ABCCEA"));  // Word Search problem
//        System.out.println(letterCombinations("79"));    // Keypad problem
//        System.out.println(subsets(new int[]{1, 2, 3}));  // Subset problem

        System.out.println(permutations(new int[]{1, 2, 3}));

    }

}
