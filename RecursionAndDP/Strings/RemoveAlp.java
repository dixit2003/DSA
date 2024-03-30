package RecursionAndDP.Strings;

public class RemoveAlp {
    static void removeAlp(String p, String u) {
        if (u.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = u.charAt(0);
        if (ch == 'a')
            removeAlp(p, u.substring(1));
        else
            removeAlp(p + ch, u.substring(1));
    }

    static String removeAlp(String str) {
        if (str.isEmpty()) {
            return "";
        }
        char ch = str.charAt(0);
        if (ch == 'a')
            return removeAlp(str.substring(1));
        else
            return ch + removeAlp(str.substring(1));
    }


    public static void main(String[] args) {
        String str = "baccaddea";
        removeAlp("", str);
        System.out.println(removeAlp(str));

    }
}
