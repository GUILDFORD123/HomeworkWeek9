package Inheritance;
/* 4.4. Write a Java program to create a class called Animal with a method named move().
Create a subclass called Cheetah that overrides the move() method to run.*/


public class Cheetah extends Animal{ // child class//

    @Override
    public void move() {
        System.out.println( "run ");

    }


    public static void main(String[] args) {

        Cheetah cheetah = new Cheetah();
        cheetah.move();


    }



}
