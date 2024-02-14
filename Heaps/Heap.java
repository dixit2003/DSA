package Heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Heap<T extends Comparable<T>> {
    private ArrayList<T> list = new ArrayList<>();

    public Heap() {
        list = new ArrayList<>();
    }
    private void swap(int f, int s) {
        T temp = list.get(f);
        list.set(f, list.get(s));
        list.set(s, temp);
    }
    private int parent(int index) {
        return (index - 1) / 2;
    }
    private int left(int index) {
        return (index * 2) + 1;
    }
    private int right(int index) {
        return (index * 2) + 2;
    }
    public void insert(T value) {
        list.add(value);
        upHeap(list.size() - 1);
    }
    public T remove() throws Exception {
        if (list.isEmpty())
            throw new Exception("Empty Heap!!!");
        T temp = list.get(0);
        T last = list.remove(list.size() - 1);
        if (!list.isEmpty()) {
            list.set(0, last);
            downHeap(0);
        }
        return temp;
    }

    private void downHeap(int index) {
        int min = index;
        int left = left(index);
        int right = right(index);

        if (left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
            min = left;
        }
        if (right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
            min = right;
        }
        if (min != index) {
            swap(min, index);
            downHeap(min);
        }
    }
    private void upHeap(int index) {
        if (index == 0)
            return;
        int p = parent(index);
        if (list.get(index).compareTo(list.get(p)) < 0)
            swap(index, p);
        upHeap(p);

    }
    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();
        while (!list.isEmpty()) {
            data.add(this.remove());
        }
        return data;
    }

    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();
        heap.insert(5);
        heap.insert(7);
        heap.insert(9);
        heap.insert(8);
        heap.insert(11);
        heap.insert(12);
        heap.insert(14);
        heap.insert(13);
        heap.insert(10);
        heap.insert(3);
        heap.insert(7);
        heap.insert(2);

        ArrayList<Integer> list1 = heap.heapSort();

        System.out.println(list1);
    }
}
