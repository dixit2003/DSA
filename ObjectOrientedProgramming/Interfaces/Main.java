package ObjectOrientedProgramming.Interfaces;

public class Main implements B{
    public static void main(String[] args) {
        Car c1 = new Car("Porshe");
        c1.brake();
        
        Engine car = new Car("Audi"); //Which attributes to access will depend on Reference variable and which version (methods) to access depends on objects
        int price = car.PRICE;
    }

    @Override
    public void greet() {
        
    }

    @Override
    public void fun() {

    }
}
