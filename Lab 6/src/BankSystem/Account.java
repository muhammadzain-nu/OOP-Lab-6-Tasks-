package BankSystem;

public class Account {

    double balance;

    Account(double balance){
        this.balance = balance;
    }

    void displayBalance(){
        System.out.println("Balance: " + balance);
    }
}