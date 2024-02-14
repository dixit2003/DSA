package ObjectOrientedProgramming.PackagesAndSingletonClass.StaticExample;

import ObjectOrientedProgramming.PackagesAndSingletonClass.SingletonClasses;

public class Main {
    void greet() {           //Belongs to an object
        System.out.println("Hey there!");
    }
    static void fun() {       //This is not dependent on objects.
//        greet();            //Cannot be used because it requires an instance, but this function doesn't depend on instance
        Main obj = new Main();
        obj.greet();
    }
    void fun2() {
        greet(); //This function now can use object of fun2
    }
    public static void main(String[] args) {
        Main g = new Main();
        g.fun2(); //Object for fun2. Non-static methods use this object internally.
        fun();


        //For the singleton class
        SingletonClasses obj = SingletonClasses.getInstance("Draxz");
        SingletonClasses obj2 = SingletonClasses.getInstance("Dharshi");

    }
}
