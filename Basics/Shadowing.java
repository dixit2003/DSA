package Basics;

public class Shadowing {
    static int x = 100;
    public static void main(String[] args) {
        System.out.println(x);   //100
        int x = 50;  //The class variable is shadowed here
        System.out.println(x); //50
        shade(); //100
    }
    static void shade(){
        System.out.println(x);
    }
}
