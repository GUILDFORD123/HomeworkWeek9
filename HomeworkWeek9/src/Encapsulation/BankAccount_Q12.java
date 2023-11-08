package Encapsulation;
/*12. Write a Java program to create a class called BankAccount with private instance
variables accountNumber and balance. Provide public getter and setter methods to
access and modify these variables.*/


public class BankAccount_Q12 {

    private int bankaccountnmber;

    private int balance;

    public int getBankaccountnmber() {
        return bankaccountnmber;
    }

    public void setBankaccountnmber(int bankaccountnmber) {
        this.bankaccountnmber = bankaccountnmber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
