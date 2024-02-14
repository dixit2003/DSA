package ObjectOrientedProgramming.Collections;

import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

//        ((ArrayList<Integer>) list).trimToSize();
//        list3.trimToSize();

        //Vector Example.
        List<Integer> vector = new Vector<>();
        vector.add(5);
        vector.add(15);
        vector.add(25);
        vector.add(35);
        System.out.println(vector);
    }
}
