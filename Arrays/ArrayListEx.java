package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);

        for (int i = 0; i < 10; i++){
            int a = sc.nextInt();
            list.add(a);
        }
        for (int i = 0; i < 10; i++){
            System.out.print(list.get(i) + ", ");
        }
//        System.out.println(list);
    }
}
