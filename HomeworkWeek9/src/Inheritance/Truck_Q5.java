package Inheritance;
/*5. Write a Java program to create a vehicle class hierarchy. The base class should be
Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have
properties such as make, model, year, and fuel type. Implement methods for
calculating fuel efficiency, distance traveled, and maximum speed.*/


public class Truck_Q5 extends VehicalHierarchy_Q5 {

    public static void main(String[] args) {
        Truck_Q5 t = new Truck_Q5();

        t.calculatingFuelefficiency(200,20);
        t.distancetravelled(350);
        t.feature("honda", "jazz",2020,"petro");



    }
}
