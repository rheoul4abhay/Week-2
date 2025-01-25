package main.HierarchicalInheritance.BankAccountTypes;

public class SavingsAccount extends BankAccount{
    
    double interestRate;
    public SavingsAccount(int accountNumber, double balance, double interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountTypes(){
        System.out.println("\nAccount type -> Savings Account");
        System.out.println("Account Number -> " + accountNumber);
        System.out.println("Account Balance -> $" + balance);
        System.out.println("Interest Rate -> " + interestRate);
    }
}
