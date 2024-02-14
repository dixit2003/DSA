package ObjectOrientedProgramming.Polymorphism;

import ObjectOrientedProgramming.Access.Access1;

public class Square extends Shape {
    void area() {
        System.out.println("A square!");
    }

    public static void main(String[] args) {
        //To check default access control
        Access1 a2 = new Access1(3, "Farzi");
        System.out.println(a2.getNum());
    }
}
