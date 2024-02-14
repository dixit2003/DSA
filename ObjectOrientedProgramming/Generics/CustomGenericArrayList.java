package ObjectOrientedProgramming.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenericArrayList<Type> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericArrayList() {
        data = new Object[DEFAULT_SIZE];
    }

    public void add(Type num) {
        if (this.isFull()){
            resize();
        }
        data[size++] = num;
    }
    public boolean isFull() {
        return size == data.length;
    }
    public void resize() {
        Object[] temp = new Object[data.length * 2];
        //Copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    public Type remove() {
        Type removed = (Type) data[--size];
        return removed;
    }
    public Type get(int index) {

        return (Type) data[index];
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
        CustomGenericArrayList<String> list1 = new CustomGenericArrayList<>();
        list1.add("Hi");
        list1.add("Ne");
        list1.add("Na");
        list1.add("Mug");

        System.out.println(list1);
        System.out.println(list1.remove());

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i + 1);
        }
        list.forEach((item) -> System.out.println(item * 2));
    }
}
