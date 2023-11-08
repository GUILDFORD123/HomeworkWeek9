package Polymorphism;
/* 6. Write a Java program to create a base class Animal (Animal Family) with a method
called Sound(). Create two subclasses Bird and Cat. Override the Sound() method in
each subclass to make a specific sound for each animal.*/



public class Cat extends Bird {

    @Override
    public void Sound() {
        System.out.println( "bird make sound like chi chi");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.Sound();
    }
}
