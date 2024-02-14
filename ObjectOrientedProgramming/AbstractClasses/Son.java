package ObjectOrientedProgramming.AbstractClasses;

public class Son extends Parent {

    public Son(int age) {
        this.age = age;
    }

    @Override
    void career(String asp) {
        System.out.println("I'm an " + asp + " and I am " + this.age);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("My partner's name is " + name + ", and she is " + age);
    }
}
