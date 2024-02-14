package ObjectOrientedProgramming.Inheritance;

public class BoxInfo {
    public static void main(String[] args) {
        Box b = new Box(4, 5, 6);
        System.out.println(b.l + " " + b.w + " " + b.h);

        BoxWeight b3 = new BoxWeight(4, 5, 6, 7);
        System.out.println(b3.h + " " + b3.weight);



        //The type of the reference variable determines which member can be accessed.
        Box b5 = new BoxWeight(2, 3, 4, 8);

//        Cannot access weight parameter, it's because the parent class cannot have access to child class.
//        System.out.println(b5.weight);          Throws Error

    }
}
