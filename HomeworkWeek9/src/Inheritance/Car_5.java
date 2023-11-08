package Inheritance;
/*5. Write a Java program to create a vehicle class hierarchy. The base class should be
Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have
properties such as make, model, year, and fuel type. Implement methods for
calculating fuel efficiency, distance traveled, and maximum speed.*/



public class Car_5 extends VehicalHierarchy_Q5 {
    public static void main(String[] args) {
        Car_5 c = new Car_5();

        c.calculatingFuelefficiency(250,120);
        c.distancetravelled(200);
        c.maximumspeed(100);
        c.feature("bmw","x",2021,"hybride");

    }



}
