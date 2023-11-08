package Polymorphism;
/*9. Write a Java program to create a base class Animal with methods move() and
makeSound(). Create two subclasses Bird and Panthera. Override the move() method
in each subclass to describe how each animal moves. Also, override the makeSound()
method in each subclass to make a specific sound for each animal.*/


public class Bird_Q9 extends Animal_Q9 {

    @Override
    public void move() {
        System.out.println(" dog bark bow bow");
        System.out.println(" bird sound chi chi");

    }

    @Override
    public void makeSound() {
        System.out.println("bow bow");
        System.out.println("chi chi");
        System.out.println("wild animal");
    }

    public static void main(String[] args) {
        Bird_Q9 b = new Bird_Q9();
        b.move();
        b.makeSound();
    }
}
