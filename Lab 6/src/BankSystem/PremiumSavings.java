package BankSystem;

public class PremiumSavings extends SavingsAccount {

    PremiumSavings(double balance){
        super(balance);
    }

    void calculateInterest(){
        double interest = balance * 0.07;
        int intInterest = (int) interest;

        System.out.println("Interest (integer): " + intInterest);
    }

    public static void main(String[] args){

        PremiumSavings account = new PremiumSavings(100000);

        account.displayBalance();
        account.calculateInterest();
    }
}