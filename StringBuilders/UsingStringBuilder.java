package StringBuilders;

import java.time.chrono.IsoEra;
import java.util.ArrayList;
import java.util.Arrays;

public class UsingStringBuilder {
    public static void main(String[] args) {
        StringBuilder series = new StringBuilder();
//        for (int i = 0; i < 26; i++) {
//            series.append((char) ('a' + i)).append(" ");
//            //System.out.println(ch);
//        }
        String str = "Hey, how are you!";
        System.out.println(Arrays.toString(str.split(" ")));
        str.contains(" ");
    }
}
