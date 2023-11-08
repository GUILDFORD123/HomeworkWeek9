package Encapsulation;
/*13. Write a Java program to create a class called Employee with private instance variables
employee_id, employee_name, and employee_salary. Provide public getter and setter
methods to access and modify the id and name variables, but provide a getter method
for the salary variable that returns a formatted string.*/


public class Employee1 extends Employee{


    public static void main(String[] args) {

        Employee e = new Employee();
        e.setEmp_id(28);
        e.setEmp_name("kinjal");


        System.out.println(e.getEmp_id());
        System.out.println(e.getEmp_name());
        System.out.println(e.getFormattedSalary(15000));



    }
}
