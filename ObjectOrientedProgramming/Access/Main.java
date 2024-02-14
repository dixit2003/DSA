package ObjectOrientedProgramming.Access;

public class Main {
    public static void main(String[] args) {
        Access1 a1 = new Access1(3, "Draxz");
//        Error due to private attribute
//        System.out.println(a1.num);
        System.out.println(a1.getNum()); //Use access controls to access private attributes from other classes

    }


}
