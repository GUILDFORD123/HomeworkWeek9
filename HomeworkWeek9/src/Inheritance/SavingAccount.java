package Inheritance;
/*Write a Java program to create a class known as "BankAccount" with methods called
deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the
withdraw() method to prevent withdrawals if the account balance falls below one
hundred.*/


public class SavingAccount extends BankAccount {

    public static void main(String[] args) {
        SavingAccount s = new SavingAccount();
        s.withdraw(200);

    }

    @Override
    public void withdraw(int money) {
        if (money>100){
            System.out.println("withdraw money");
        }
        else {
            System.out.println("not able to withdraw money");
        }
    }
}





