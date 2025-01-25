package main.HierarchicalInheritance.BankAccountTypes;

public class CheckingAccount extends BankAccount{

    double withdrawalLimit;
    public CheckingAccount(int accountNumber, double balance, double withdrawalLimit){
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountTypes(){
        System.out.println("\nAccount type -> Checking Account");
        System.out.println("Account Number -> " + accountNumber);
        System.out.println("Account Balance -> $" + balance);
        System.out.println("Withdrawl Limit -> " + withdrawalLimit);
    }
}
