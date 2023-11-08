package Encapsulation;
/*11. Write a Java program to create a class called Person with private instance variables
name, age. and country. Provide public getter and setter methods to access and modify
these variables.*/



public class Person {
private String per_name;
private int per_age;
private  String country;


public String getPer_name(){return per_name;}

 public int getPer_age(){ return per_age;}


    public void setPer_name(String per_name) {
        this.per_name = per_name;
    }

    public void setPer_age(int per_age) {
        this.per_age = per_age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}




