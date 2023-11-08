package Inheritance;
/*Write a Java program to create a class known as "BankAccount" with methods called
deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the
withdraw() method to prevent withdrawals if the account balance falls below one
hundred.*/


public class BankAccount {




    public static void main(String[] args) {
BankAccount b = new BankAccount();
b.deposit();
b.withdraw(300);
    }
    public void deposit(){

    }
    public void withdraw(int money){

    }
}