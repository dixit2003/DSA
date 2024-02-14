package ObjectOrientedProgramming.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Here T should be Number or it's sub-class
public class WildCard<Type extends Number>{ //Type extends number class
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public void getList(List<Number> list) {
        //Do

        //Here you can only pass Number Type
    }
    public void getList1(List<? extends Number> list) {
        //Do

        //Here you can pass Number Type and it's sub-classes
    }

    public WildCard() {
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

        WildCard<Number> list2 = new WildCard<>();
        list2.add(3.34f);
        list2.add(5);
//        list2.add("ghj"); //Cannot add string
        System.out.println(list2);

        WildCard<Integer> w1 = new WildCard<>();

        List<Integer> list3 = new ArrayList<>();
//        w1.getList(list3); //Only Number type can be provided. So throws error.
        w1.getList1(list3); //Any sub-class of Number type can be provided!
    }
}
