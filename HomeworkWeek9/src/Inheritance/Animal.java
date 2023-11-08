package Inheritance;
/*4. 4. Write a Java program to create a class called Animal with a method named move().
Create a subclass called Cheetah that overrides the move() method to run.*/


public class Animal { // parent class//

    public void move(){

        System.out.println("i love dogs");

    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.move();


    }
}
