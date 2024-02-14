package ObjectOrientedProgramming.Generics.Comparision;

import ObjectOrientedProgramming.Interfaces.A;

import java.util.Arrays;

public class Student implements Comparable<Student>{
    int rollNo;
    int marks;
    public Student(int marks, int rollNo) {
        this.marks = marks;
        this.rollNo = rollNo;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int) (this.marks - o.marks);
        // if diff is zer, both are equal.
        //if diff is less than 0 drax is greater, else dharshi
        return diff;
    }

    @Override
    public String toString() {
        return rollNo + ", " + marks;
    }

    public static void main(String[] args) {
        Student drax = new Student(140, 98);
        Student dharshi = new Student(156, 97);
        Student bhanu = new Student(155, 36);
        Student mani = new Student(169, 23);
        Student gilbert = new Student(143, 44);

        Student[] list = {drax, dharshi, bhanu, mani, gilbert};


        if (drax.compareTo(dharshi) < 0) {
            System.out.println(drax.compareTo(dharshi));
            System.out.println("Dharshi got more!");
        }

        System.out.println(Arrays.toString(list));
        Arrays.sort(list); //Based on marks due to the comparable method
        System.out.println(Arrays.toString(list));

    }


}
