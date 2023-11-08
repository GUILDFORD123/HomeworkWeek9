package Polymorphism;
/*9. Write a Java program to create a base class Animal with methods move() and
makeSound(). Create two subclasses Bird and Panthera. Override the move() method
in each subclass to describe how each animal moves. Also, override the makeSound()
method in each subclass to make a specific sound for each animal.*/


public class Panthera_Q9 extends Bird_Q9{


    @Override
    public void move() {
        System.out.println("panthera is wild cat");
        System.out.println("dog bark bow bow");
        System.out.println("bird sound chi chi");

    }

    @Override
    public void makeSound() {
        System.out.println("bow bow");
        System.out.println("chi chi");
        System.out.println("wild cat");
    }


    public static void main(String[] args) {
        Panthera_Q9 p = new Panthera_Q9();
        p.move();
        p.makeSound();
    }
}
