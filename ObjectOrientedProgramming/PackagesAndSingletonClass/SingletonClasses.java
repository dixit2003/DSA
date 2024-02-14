package ObjectOrientedProgramming.PackagesAndSingletonClass;

public class SingletonClasses {
    //Class which allows you to create only one object in any other class.
    String name;
    private SingletonClasses(String name) {
        this.name = name;
    }
    private static SingletonClasses instance;
    public static SingletonClasses getInstance(String name) {
        //Check whether only one object is created.
        if (instance == null) {
            instance = new SingletonClasses(name);
            System.out.println(name);
        }
        return instance;
    }

}
