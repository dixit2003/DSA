package Softskills;

public class StrobogrammaticNumber {

    static boolean isStrobo(int n) {
        String s = Integer.toString(n);

        int l = 0;
        int r = s.length() - 1;

        if (s.length() == 1 && (s.contains("0") || s.contains("1") || s.contains("6") || s.contains("8") || s.contains("9"))) {
            return true;
        }

        while (l <= r) {
            if (s.contains("2") || s.contains("3") || s.contains("4") || s.contains("5") || s.contains("7")) {
                return false;
            }

            if ((s.charAt(l) == '6' && s.charAt(r) == '9') || (s.charAt(l) == '9' && s.charAt(r) == '6')
                    || (s.charAt(l) == '0' && s.charAt(r) == '0') || (s.charAt(l) == '1' && s.charAt(r) == '1')
                    || (s.charAt(l) == '8' && s.charAt(r) == '8')) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }
    static int countStrobos(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            if (isStrobo(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countStrobos(0, 100));
    }
}
