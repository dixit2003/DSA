package ObjectOrientedProgramming.Inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(double l, double w, double h, double weight) {
        // Used to initialize values present in parent class
        super(l, w, h); // Calls the parents class constructor
        this.weight = weight;
    }
    BoxWeight (BoxWeight other) {
        super(other);
//        The above base class will be parent class and here the object of child class is being passed. Therefore, only the properties belonging to parent class
//        can be accessed. Remaining will be null.
        weight = other.weight;
    }

    public static void main(String[] args) {
        // Same condition arises here, the reference variable determines which members can be accessed
        BoxWeight bw = new BoxWeight(5, 6, 7, 12);

//        System.out.println(bw.weight);
        BoxWeight bw1 = new BoxWeight(bw);
        //The below value will be null.
        System.out.println(bw1.weight);
    }

}
