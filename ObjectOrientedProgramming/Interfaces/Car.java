package ObjectOrientedProgramming.Interfaces;

import java.security.PublicKey;

public class Car implements Engine, Brake, Media{

    String carName;
    public Car(String carName) {
        this.carName = carName;
    }
    @Override
    public void brake() {
        System.out.println(carName + " brakes are awesome!");
    }
    @Override
    public void start() {
        System.out.println(carName + " starts in style.");
    }
    @Override
    public void stop() {
        System.out.println("The brake system for " + carName + " is very well designed.");
    }

    @Override
    public void acc() {
        System.out.println("The pickup for " + carName + " is great!");
    }
}
