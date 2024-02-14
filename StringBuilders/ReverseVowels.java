package StringBuilders;

public class ReverseVowels {
    static String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            if (!vowels(arr[i]) && !vowels(arr[j])) {
                i++;
                j--;
            }
            else {
                if (vowels(arr[i]) && vowels(arr[j])) {
                    char c1 = arr[i];
                    arr[i] = arr[j];
                    arr[j] = c1;
                    i++;
                    j--;
                } else if (vowels(arr[i])) {
                    j--;
                } else if (vowels(arr[j])) {
                    i++;
                }
            }
        }
        return new String(arr);
    }

    static boolean vowels(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("aA"));
    }
}
