package ObjectOrientedProgramming.PackagesAndSingletonClass.StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population; //Static property. Common for all objects

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        //In order to access a static variable, use the name of the class
        Human.population += 1;
    }
    Human() {

    }
    public void printHumanDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Salary: " + this.salary);
        System.out.println("Marital status: " + this.married);
        System.out.println("Population: " + Human.population);
    }

    public static void main(String[] args) {
        Human dixit = new Human(20, "Draxz", 2000000, false);
        Human specky = new Human(20, "Dharshini", 1500000, false);
        System.out.println(Human.population);
    }
}
