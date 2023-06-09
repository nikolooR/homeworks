package io.codelex.polymorphism.practice.exercise1;

public class Audi implements Car {
    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 10;
    }

    public void slowDown() {
        currentSpeed += 10;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public String getCarName() {
        return "Audi";
    }

    @Override
    public void startEngine() {
        Car.super.startEngine();
    }
}
