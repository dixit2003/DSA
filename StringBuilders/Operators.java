package StringBuilders;

import java.util.ArrayList;
import java.util.Arrays;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char) ('a' + 3));
        System.out.println("a" + 1); //Same as "A" + "1". 1 will call .toString()
        System.out.println("Dixit" + new ArrayList<>());
        System.out.println("Dixit" + Arrays.toString(new int[]{1, 2, 3}));
//      System.out.println(new Integer(56) + new ArrayList<>());  Error, because no string type is available for concatenation.
        System.out.println(new Integer(56) + "" + new ArrayList<>());
    }
}
