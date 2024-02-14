package ObjectOrientedProgramming.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    //Only works for integers, but we need it to be possible for all datatypes.
    //For that we use Generics.

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (this.isFull()){
            resize();
        }
        data[size++] = num;
    }
    public boolean isFull() {
        return size == data.length;
    }

    public void resize() {
        int[] temp = new int[data.length * 2];
        //Copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    public int remove() {
        int removed = data[--size];
        return removed;
    }
    public int get(int index) {
        return data[index];
    }
    public void set(int index, int ele) {
        data[index] = ele;
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        if (data.length == 0)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
//        list.add(45);
//        list.get(0);
//        list.set(1, 69);
//        list.size();
//        list.isEmpty();
        CustomArrayList list1 = new CustomArrayList();
        list1.add(3);
        list1.add(5);
        list1.add(9);

        System.out.println(list1);


    }
}
