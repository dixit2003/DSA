package LargeData;

import java.util.Arrays;
import java.util.Random;
import java.text.DecimalFormat;

public class BufferString {
    static String generate(int size) {
        Random rd = new Random();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < size; i++) {
            int x = 97 + (int) (rd.nextFloat() * 26);
            sb.append((char) x);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(generate(10));

        String str = "Hi hello B BC News!!!";
        System.out.println(str.replaceAll(" ", ""));

        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println(df.format(7.29));

    }
}
