package ObjectOrientedProgramming.Cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(Human h) {
        this.age = age;
        this.name = name;

    }
    public Human(int age, String name) {
        this.name = name;
        this.age = age;
        this.arr = new int[]{3, 4, 5, 6, 7, 8};
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //Shallow copy of an object.
//        return super.clone(); //When super.clone() is invoked within this method,
        // it calls the clone() method of the Object class,
        // creating a shallow copy of the object. It just means Object.clone in this context.

        Human copy = (Human) super.clone();
        copy.arr = new int[copy.arr.length];
        for (int i = 0; i < copy.arr.length; i++) {
            copy.arr[i] = this.arr[i];
        }
        return copy;

    }

}
