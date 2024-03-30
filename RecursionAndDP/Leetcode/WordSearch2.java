package RecursionAndDP.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class WordSearch2 {
    static List<String> findWords(char[][] board, String[] words) {
        List<String> list = new ArrayList<>();
        boolean wordFound = false;

        for (String word : words) {
            boolean[][] arr = new boolean[board.length][board[0].length]; // Initialize visited array for each word
            for (int i = 0; i < board.length && !wordFound; i++) {
                for (int j = 0; j < board[0].length && !wordFound; j++) {
                    if (helperExists(board, arr, i, j, 0, word)) {
                        list.add(word);
                        wordFound = true;  // Set the flag to true
                    }
                }
            }
            wordFound = false;  // Reset the flag for the next word
        }
        return list;
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

    public static void main(String[] args) {
        System.out.println(findWords(new char[][]{{'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}},
                new String[]{"oath","eat","pie","rain"}));
    }

}
