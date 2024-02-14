package ObjectOrientedProgramming.Cloning;

import ObjectOrientedProgramming.Interfaces.A;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human h = new Human(20, "Draxz");

        Human twin = (Human) h.clone(); //Object.clone
        System.out.println(twin.age + ", " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;
        //Shallow copy.
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(h.arr)); //Shouldn't have got modified according to
        //basic array modification, but here the top object element is also modified

        //Deep copy implementation is done in Human class, therefore no change for top object element.

    }

}
