package ObjectOrientedProgramming.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Square square = new Square();

        Shape sq = new Circle();
        sq.area();

    }
}
