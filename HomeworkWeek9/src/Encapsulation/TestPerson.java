package Encapsulation;
/*11. Write a Java program to create a class called Person with private instance variables
name, age. and country. Provide public getter and setter methods to access and modify
these variables.*/


public class TestPerson extends Person{

    public static void main(String[] args) {
        TestPerson t = new TestPerson();
        t.setPer_name("ripti");
        t.setCountry("india");
        t.setPer_age(35);

        System.out.println(t.getPer_name());
        System.out.println(t.getCountry());
        System.out.println(t.getPer_age());
        System.out.println("********************************");




    }
}
