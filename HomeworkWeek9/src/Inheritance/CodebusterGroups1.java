package Inheritance;

/* 1. Write a Java program to create a class called codebuster with a method called
groupName(). Create a subclass called codebusterGroups() that overrides the
groupName() method.*/


public class CodebusterGroups1 extends CodeBuster_Q1 {


    public static void main(String[] args) {
        CodebusterGroups1 codebusterGroups = new CodebusterGroups1();
        codebusterGroups.groupName();


    }

    @Override
    public void groupName() {
        System.out.println("This is codebustergroups group");

    }
}