package ObjectOrientedProgramming.Inheritance;

public class Box {
    double l;
    double w;
    double h;
    Box() {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }
    //Cube
    Box(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }
    //Cuboid
    Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
    Box(Box b) {
        this.l = b.l;
        this.w = b.w;
        this.h = b.h;
    }
    public void box() {
        System.out.println("This is box.");
    }

    public static void main(String[] args) {

    }
}
