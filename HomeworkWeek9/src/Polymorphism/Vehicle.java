package Polymorphism;
/*7. Write a Java program to create a class Vehicle with a method called speedUp(). Create
two subclasses Car and Bicycle. Override the speedUp() method in each subclass to
increase the vehicle's speed differently.*/


public class Vehicle {

    public  void  speedUp(){
        System.out.println(" i drive GLB");
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.speedUp();
    }
    }

