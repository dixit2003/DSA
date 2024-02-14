package Miscellaneous;

public class DetermineIfaCellIsReachableAtAGivenTime {
    static boolean isReachable(int sx, int sy, int fx, int fy, int t) {
        int x = Math.abs(fx - sx);
        int y = Math.abs(fy - sy);

        if (x == 0 && y == 0 && t == 1) {
            return false;
        }

        int linearDist = Math.abs(x - y);

        return Math.min(x, y) + linearDist <= t;
    }
}
