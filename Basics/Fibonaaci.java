package Basics;

public class Fibonaaci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        for (int i=1; i <= 10; i++){
            System.out.print(a + ", ");
            int c = b + a;
            a = b;
            b = c;
        }

    }


}
