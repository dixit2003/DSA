package Basics;

import java.util.Arrays;

public class VarArgs {
    static void variableArgs(int...v){
        System.out.println(Arrays.toString(v));
    }
    static void variableArgs(int a, int b, char ...c){
        System.out.println(a + ", " + b);
        System.out.println(Arrays.toString(c));
    }
    public static void main(String[] args) {
        variableArgs(1, 5, 9, 7, 21, 15, 41, 10);
        variableArgs(1, 2, 'D', 'I', 'X', 'I', 'T');
    }
}
