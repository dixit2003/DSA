package LinearSearch;

public class SearchString {
    static boolean searchTheArray(String str, char c) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "qwertyuioasdfghjmnbvc";
        System.out.println(searchTheArray(str, 't'));
    }
}



