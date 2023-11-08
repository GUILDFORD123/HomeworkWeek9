package Polymorphism;
/*9. Write a Java program to create a base class Animal with methods move() and
makeSound(). Create two subclasses Bird and Panthera. Override the move() method
in each subclass to describe how each animal moves. Also, override the makeSound()
method in each subclass to make a specific sound for each animal.*/



public class Animal_Q9 {

    public void move(){
        System.out.println(" dog bark bow bow");

    }
public void makeSound(){
    System.out.println("bow bow");
    System.out.println("chi chi");
    System.out.println("wild animal");
}
    public static void main(String[] args) {
        Animal_Q9 a = new Animal_Q9();
        a.move();
        a.makeSound();
    }
}
