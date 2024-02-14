package Recursions.Strings;

public class SkipString {
    static String skipSpecificString(String str) {
        if (str.isEmpty())
            return "";

        if (str.startsWith("ab"))
            return skipSpecificString(str.substring(2));
        else
            return str.charAt(0) + skipSpecificString(str.substring(1));
    }

    public static void main(String[] args) {
        String str = " babnmjkabioabgd";
        System.out.println(skipSpecificString(str));
    }

}
