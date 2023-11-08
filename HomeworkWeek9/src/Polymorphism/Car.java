package Polymorphism;
/*7. Write a Java program to create a class Vehicle with a method called speedUp(). Create
two subclasses Car and Bicycle. Override the speedUp() method in each subclass to
increase the vehicle's speed differently.*/


public class Car extends Vehicle {
    @Override
    public void speedUp() {
        int a = 50;
        System.out.println(a);

    }

    public static void main(String[] args) {

        Car car = new Car();
        car.speedUp();

        }
    }

