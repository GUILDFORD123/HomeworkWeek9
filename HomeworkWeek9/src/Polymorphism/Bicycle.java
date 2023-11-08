package Polymorphism;
/*7. Write a Java program to create a class Vehicle with a method called speedUp(). Create
two subclasses Car and Bicycle. Override the speedUp() method in each subclass to
increase the vehicle's speed differently.*/


public class Bicycle extends Car {

    @Override
    public void speedUp() {
        int b = 70;
        System.out.println(b);
    }

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.speedUp();
    }
}
