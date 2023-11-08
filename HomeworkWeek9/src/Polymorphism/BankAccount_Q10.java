package Polymorphism;
/*10. Write a Java program to create a base class BankAccount with methods deposit() and
withdraw(). Create two subclasses SavingsAccount and CheckingAccount. Override the
withdraw() method in each subclass to impose different withdrawal limits and fees.*/


public class BankAccount_Q10 {

    class BankAccount {
        private String accountNumber;
        private double balance;

        public BankAccount(String accountNumber, double initialBalance) {
            this.accountNumber = accountNumber;
            this.balance = initialBalance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited $" + amount);
            } else {
                System.out.println("Invalid deposit amount");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn $" + amount);
            } else {
                System.out.println("Invalid withdrawal amount or insufficient balance");
            }
        }

        public double getBalance() {
            return balance;
        }
    }
    }

