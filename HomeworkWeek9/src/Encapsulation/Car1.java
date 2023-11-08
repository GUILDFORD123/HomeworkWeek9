package Encapsulation;
/*14. Write a Java program to create a class called Car with private instance variables
company_name, model_name, year, and mileage. Provide public getter and setter
methods to access and modify the company_name, model_name, and year variables.
However, only provide a getter method for the mileage variable.*/


public class Car1 extends Car{

    public static void main(String[] args) {
        Car c = new Car();
        c.setCompany_name("kaniya ltd");
        c.setModel_name("GLB");
        c.setYear(2020);


        System.out.println(c.getCompany_name( ));
        System.out.println(c.getModel_name());
        System.out.println(c.getYear());
        System.out.println(c.getMileage());
    }
}
