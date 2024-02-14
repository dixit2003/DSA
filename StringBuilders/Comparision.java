package StringBuilders;

public class Comparision {
    public static void main(String[] args) {
        String a = "Hey!";
        String b = "Hey!";

        System.out.println(a == b);

        String x = new String("Hi!");
        String y = new String("Hi!");

        System.out.println(x == y);

        System.out.println(x.equals(y));
    }
}
