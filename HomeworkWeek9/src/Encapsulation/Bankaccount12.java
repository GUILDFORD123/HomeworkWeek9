package Encapsulation;
/*12. Write a Java program to create a class called BankAccount with private instance
variables accountNumber and balance. Provide public getter and setter methods to
access and modify these variables.*/


public class Bankaccount12 extends BankAccount_Q12 {

    public static void main(String[] args) {
        Bankaccount12 b = new Bankaccount12();
        b.setBalance(25000);
        b.setBankaccountnmber(123456);


        System.out.println(b.getBalance());
        System.out.println(b.getBankaccountnmber());

    }


}
