package Inheritance;
/*5. Write a Java program to create a vehicle class hierarchy. The base class should be
Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have
properties such as make, model, year, and fuel type. Implement methods for
calculating fuel efficiency, distance traveled, and maximum speed.*/



public class VehicalHierarchy_Q5 {
    public void vehical(){

        String fueltype;
    }

    public static void main(String[] args) {

           VehicalHierarchy_Q5 v = new VehicalHierarchy_Q5();
           v.calculatingFuelefficiency(200,10);
v.distancetravelled(150);
v.maximumspeed(150);



    }



    public void calculatingFuelefficiency(double distance,double fuelused){
        double fluefficiency = distance/fuelused;
        System.out.println("Fuelfficiency : "+fluefficiency );
    }

public void distancetravelled(double distance){
    System.out.println("Distance travelled"+ distance+ "miles");
}
public void maximumspeed(double miles){
    System.out.println("Maximumspeed :"+miles+"miles/hour");

}
public void feature(String make,String model, double year,String fueltype){
    System.out.println(make);
    System.out.println(model);
    System.out.println(year);
    System.out.println(fueltype);
}
    }




