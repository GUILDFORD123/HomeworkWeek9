package Polymorphism;
/* 6. Write a Java program to create a base class Animal (Animal Family) with a method
called Sound(). Create two subclasses Bird and Cat. Override the Sound() method in
each subclass to make a specific sound for each animal.*/


public class Animal {  // parent class//

    public void Sound(){

        System.out.println( " i love birds ");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal .Sound();
    }
}
