package ObjectOrientedProgramming.Inheritance;

public class BoxPrice extends BoxWeight {
    public double cost;
    BoxPrice(BoxPrice other) {
        super(other);
    }
    public BoxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }

    public static void main(String[] args) {
        BoxPrice bp = new BoxPrice(3, 5, 6, 1, 10);
        System.out.println(bp.weight);

        BoxPrice bp1 = new BoxPrice(bp);
        System.out.println(bp.cost);

    }
}
