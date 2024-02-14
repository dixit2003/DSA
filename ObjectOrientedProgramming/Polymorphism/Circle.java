package ObjectOrientedProgramming.Polymorphism;
public class Circle extends Shape {
    @Override //Late binding
    void area() {
        System.out.println("A circle!");
    } 
}
