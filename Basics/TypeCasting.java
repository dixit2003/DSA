package Basics;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          //Float has high priority than int. Int can be assigned to float but not vice-versa
//        float num = sc.nextFloat();
//        System.out.println(num);
//
          //Type casting
//        int num1 = (int)(48.56f);
//        System.out.println(num1);
//
          //Automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a);
//        System.out.println(b); //257 % 256 = = 1

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a * b) / c;
//
//        System.out.println(d);

        byte b = 42;
        char c = 'd';
        short s = 1024;
        int i = 52004;
        float f = 5.67f;
        double d = 0.12435;
        double result = (f * b) + (i / c) - (d * s);

        //float + int - double = double, has high priority

        System.out.println((f * b) + ", " + (i / c) + ", " + (d * s));
        System.out.println(result);
    }
}
