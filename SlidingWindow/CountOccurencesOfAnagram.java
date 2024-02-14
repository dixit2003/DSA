package SlidingWindow;
public class CountOccurencesOfAnagram {
    static int search(String txt, String pat) {
        int[] patArray = new int[26];
        int n = txt.length();
        int ans = 0;

        for (int i = 0; i < pat.length(); i++) {
            patArray[pat.charAt(i) - 'a']++;
        }
        int i = 0;
        int j = 0;
        int k = pat.length();

        while (j < n) {
            patArray[txt.charAt(j) - 'a']--;
            if (j - i + 1 == k) {
                if (allZeros(patArray)) {
                    ans++;
                }
                patArray[txt.charAt(i) - 'a']++;
                i++;
            }
            j++;
        }
        return ans;
    }
    static boolean allZeros(int[] arr) {
        for (int j : arr) {
            if (j != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(search("forxxorfxdofr", "for"));
    }
}
